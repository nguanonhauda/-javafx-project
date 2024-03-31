import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;

class Product implements Serializable {
    private String code;
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    // Getters and setters
}

class Order implements Serializable {
    private String orderId;
    private ArrayList<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Getters and setters

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}

public class Main extends Application {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private String productFile = "products.dat";
    private String orderFile = "orders.dat";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Load data from files
        loadProducts();
        loadOrders();

        // UI elements
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label lblCode = new Label("Code:");
        TextField txtCode = new TextField();
        Label lblName = new Label("Name:");
        TextField txtName = new TextField();
        Label lblPrice = new Label("Price:");
        TextField txtPrice = new TextField();
        Button btnAddProduct = new Button("Add Product");

        gridPane.add(lblCode, 0, 0);
        gridPane.add(txtCode, 1, 0);
        gridPane.add(lblName, 0, 1);
        gridPane.add(txtName, 1, 1);
        gridPane.add(lblPrice, 0, 2);
        gridPane.add(txtPrice, 1, 2);
        gridPane.add(btnAddProduct, 0, 3);

        btnAddProduct.setOnAction(event -> {
            String code = txtCode.getText();
            String name = txtName.getText();
            double price = Double.parseDouble(txtPrice.getText());
            Product product = new Product(code, name, price);
            products.add(product);
            saveProducts();
            showAlert(Alert.AlertType.INFORMATION, "Product Added", "Product has been added successfully.");
        });

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sales Management App");
        primaryStage.show();
    }

    private void saveProducts() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(productFile))) {
            outputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProducts() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(productFile))) {
            products = (ArrayList<Product>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveOrders() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(orderFile))) {
            outputStream.writeObject(orders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadOrders() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(orderFile))) {
            orders = (ArrayList<Order>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}