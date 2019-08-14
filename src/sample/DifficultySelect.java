package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by aspol on 01/12/2016.
 */
public class DifficultySelect {

    static boolean choice;
    static String result;
    public static String Display(){

        Stage window2 = new Stage();
        Stage window = new Stage();
        window.setTitle("Difficulty selection");

        ToggleGroup difficulty = new ToggleGroup();
        RadioButton easy = new RadioButton("Easy");
        easy.setToggleGroup(difficulty);
        easy.setSelected(true);
        easy.setUserData("A");
        RadioButton medium = new RadioButton("Medium");
        medium.setToggleGroup(difficulty);
        medium.setUserData("B");
        RadioButton hard = new RadioButton("Hard");
        hard.setToggleGroup(difficulty);
        hard.setUserData("C");
        RadioButton very_hard = new RadioButton("Very Hard");
        very_hard.setToggleGroup(difficulty);
        very_hard.setUserData("D");
        Button confirm = new Button("Confirm");
        confirm.setOnAction(event -> {

        result =    difficulty.getSelectedToggle().getUserData().toString();

            window.close();

        });
        confirm.setAlignment(Pos.CENTER);


        Label label = new Label("Please choose a difficulty option.");
        label.setPrefSize(370,78);
        label.setPadding(new Insets(0,0,0,0));
        label.setAlignment(Pos.CENTER);


        HBox hbox = new HBox(20);
        hbox.setMaxWidth(370);
        hbox.setMaxHeight(150);
        hbox.setPadding(new Insets(0,0,0,30));
        hbox.getChildren().addAll(easy,medium,hard,very_hard);

        //layout
        BorderPane layout = new BorderPane();
        layout.setMargin(label,new Insets(-20,0,0,0));
        layout.setMargin(confirm,new Insets(20,0,20,175));
        layout.setMargin(hbox, new Insets(-10,0,-40,0));

        layout.setCenter(hbox);
        layout.setTop(label);
        layout.setBottom(confirm);

        Scene scene = new Scene(layout,400,150);
        window.setScene(scene);
        window.setMaxHeight(180);
        window.setMaxWidth(400);
        window.showAndWait();













        return result;
    }
    }











