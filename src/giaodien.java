import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public void btnView1Clicked(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Giaodiennew.fxml"));
    Parent root = loader.load();
    
    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    
    stage.setScene(scene);
    stage.show(); 
}