package JavaFXSceneBuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class TemplateController {

    @FXML
    private Label label;

    private int i = 0;

    @FXML
    public void incrementation(){
        label.setText("Value is: " + ++i);
    }
}
