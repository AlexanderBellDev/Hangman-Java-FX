package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by aspol on 03/12/2016.
 */
public class LetterAlreadyInput {
    public static Main main = new Main();

    public static void display(){

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Alert!");
        window.setMinWidth(250);

        Label label = new Label("This letter has already been input");

        Button close = new Button("Close window");
        close.setOnAction(event -> {


            window.close();

        });
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,close);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }






}


