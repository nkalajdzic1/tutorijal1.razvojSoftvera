package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label poruka;

    public void reciHello(ActionEvent actionEvent){
        poruka.setText("Poy");
    }
}
