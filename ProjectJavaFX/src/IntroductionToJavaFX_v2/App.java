package IntroductionToJavaFX_v2;

import javafx.scene.control.CheckBox;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.getStyleClass().add("grid-pane");

        Button button_1 = new Button("Button 1");
        Button button_2 = new Button("Button 2");
        //button_2.setStyle("-fx-base: #7DFF88;");
        button_2.setId("button_2");

        TextField textField_1 = new TextField("Text field 1");
        TextField textField_2 = new TextField("Text field 2");

        CheckBox checkbox_1 = new CheckBox("Check box 1");
        CheckBox checkbox_2 = new CheckBox("Check box 2");

        gridPane.add(button_1, 0, 0);
        gridPane.add(button_2, 0, 1);

        gridPane.add(textField_1, 1, 0);
        gridPane.add(textField_2, 1, 1);

        gridPane.add(checkbox_1, 2, 0);
        gridPane.add(checkbox_2, 2, 1);

        Scene scene = new Scene(gridPane, 500, 200);
        scene.getStylesheets().add("IntroductionToJavaFX_v2/style.css");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
