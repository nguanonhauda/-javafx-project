import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Tạo một nhãn
        Label label = new Label("Chào mừng bạn đến với JavaFX!");

        // Tạo một nút
        Button button = new Button("Nhấn vào đây");
        // Thiết lập hành động khi nút được nhấn
        button.setOnAction(e -> System.out.println("Bạn đã nhấn vào nút!"));

        // Tạo một layout sử dụng VBox (Vertical Box)
        VBox root = new VBox();
        // Thêm các thành phần vào layout
        root.getChildren().addAll(label, button);

        // Tạo một Scene với layout
        Scene scene = new Scene(root, 300, 200);

        // Thiết lập tiêu đề của cửa sổ
        primaryStage.setTitle("Ứng dụng JavaFX đơn giản");

        // Thiết lập Scene cho Stage (cửa sổ)
        primaryStage.setScene(scene);

        // Hiển thị cửa sổ
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Gọi phương thức launch để khởi chạy ứng dụng JavaFX
        launch(args);
    }
}