package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by aspol on 01/12/2016.
 */
public class LoadSelect {

    static boolean choice;

    public static boolean Display(){




        Stage window;
        window = new Stage();

        window.setTitle("Game Selection");

// Buttons
        Button seqbut = new Button("Load Game");
        seqbut.setPrefHeight(31);
        seqbut.setPrefSize(89,31);
        Button parbut = new Button("New Game");

        parbut.setPrefHeight(31);
        parbut.setPrefSize(89,31);

        seqbut.setOnAction(event -> {
            choice = true;

            //  try{
            //      new HangmanMain();
            //  }

            //  catch(IOException e){

            //   }
            window.close();



        });

        parbut.setOnAction( event -> {

            choice = false;

            //   try{
            //       new HangmanMain();
            //    }

            //    catch(IOException e){
//
            //   }


            window.close();

        });

        //Label
        Label label = new Label("Please choose whether to load or play a new game");
        label.setPrefSize(370,78);
        label.setPadding(new Insets(0,0,0,30));
        label.setAlignment(Pos.CENTER);


        HBox hbox = new HBox(20);
        hbox.setMaxWidth(200);
        hbox.setMaxHeight(100);
        hbox.setPadding(new Insets(0,0,0,0));
        hbox.getChildren().addAll(seqbut,parbut);

        //layout
        BorderPane layout = new BorderPane();
        layout.setCenter(hbox);
        layout.setTop(label);

        Scene scene = new Scene(layout,400,150);
        window.setScene(scene);

        window.showAndWait();


        return choice;
    }






















}






