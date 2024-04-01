import javafx.event.ActionEvent;
import javafx.scene.control.Alert;


public class giaodien{
    public void Summit (ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION) ; 
        alert.setContentText("Xem");
        alert.show();
    }
}