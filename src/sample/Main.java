package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    boolean result;
    String difficulty;
    int randomNum;
    String selectedWord = "";
    Stage window;
    char buttonClicked;
    int wordcounter = 0;
   boolean wordIsGuessed = false;
    ObservableList<Character> wrongletters = FXCollections.observableArrayList();
    ObservableList<Character> correctletters = FXCollections.observableArrayList();

    List<Character> wrongletterssave = new ArrayList<Character>();
    List<Character> correctletterssave = new ArrayList<Character>();
    Label letter1 = new Label("_");
    Label letter2 = new Label("_");
    Label letter3 = new Label("_");
    Label letter4 = new Label("_");
    Label letter5 = new Label("_");
    Label letter6 = new Label("_");
    Label letter7 = new Label("_");
    Label letter8 = new Label("_");
    int imagecounter = 0;
    ImageView iv1 = new ImageView();
    boolean gameover = false;
    public static ArrayList<List> Savedata = new ArrayList<>();
    public static ArrayList<List> LoadData = new ArrayList<>();
    List<String> subsaveData = new ArrayList<String>();
    String wordcounter1;
    public static ObjectOutputStream out;
    boolean selectedgame;


    List<Character> selectedwordList = new ArrayList<Character>();


    @Override
    public void start(Stage primaryStage) throws Exception{
     window = primaryStage;
        primaryStage.setTitle("Hangman");

        GridPane layout = new GridPane();
        //gridpane sizing
        layout.setMaxSize(669,446);
        //columns
        ColumnConstraints column1 = new ColumnConstraints(10,347,394);
        column1.setHgrow(Priority.SOMETIMES);
        ColumnConstraints column2 = new ColumnConstraints(10,322,360);
        column2.setHgrow(Priority.SOMETIMES);
        layout.getColumnConstraints().addAll(column1, column2);
        //rows

        //row1
        RowConstraints row1 = new RowConstraints(0,42,127);

        row1.setVgrow(Priority.SOMETIMES);
        //row2
        RowConstraints row2 = new RowConstraints(10,191,276);

        row2.setVgrow(Priority.SOMETIMES);

        //row3
        RowConstraints row3 = new RowConstraints(10,44,276);

        row3.setVgrow(Priority.SOMETIMES);

        //row4
        RowConstraints row4 = new RowConstraints(10,147,150);

        row4.setVgrow(Priority.SOMETIMES);
        //addingallrows

        layout.getRowConstraints().addAll(row1,row2,row3,row4);

        //flowpane
        //flowpane sizing
        FlowPane flowPane = new FlowPane();
        flowPane.setPrefSize(649,150);
        flowPane.setPadding(new Insets(30));
        //flowpane Label
        Label flowlabel = new Label("Choose a letter:");
        flowlabel.setPrefSize(361,17);
        flowlabel.setPadding(new Insets(0,33,0,0));
        flowPane.getChildren().add(flowlabel);
        //buttons
        Button a = new Button("A");
        a.setMinWidth(33);
        a.setFont(new Font("Arial", 13));
        a.setOnAction(event -> {
            buttonClicked = 'A';
            onButtonClick();

        });
        flowPane.getChildren().add(a);
        //b
        Button b = new Button("B");
        b.setMaxWidth(33);
        b.setMinSize(33,26);
        b.setFont(new Font("Arial", 13));
        b.setOnAction(event -> {
            buttonClicked = 'B';
            onButtonClick();


        });
        flowPane.getChildren().add(b);
        //c
        Button c = new Button("C");
        c.setMaxWidth(33);
        c.setMinSize(33,26);
        c.setFont(new Font("Arial", 13));
        c.setOnAction(event -> {
            buttonClicked = 'C';
            onButtonClick();


        });
        flowPane.getChildren().add(c);
        //d
        Button d = new Button("D");
        d.setMaxWidth(33);
        d.setMinSize(33,26);
        d.setFont(new Font("Arial", 13));
        d.setOnAction(event -> {
            buttonClicked = 'D';
            onButtonClick();


        });
        flowPane.getChildren().add(d);
        //e
        Button e = new Button("E");
        e.setMaxWidth(33);
        e.setMinSize(33,26);
        e.setFont(new Font("Arial", 13));
        e.setOnAction(event -> {
            buttonClicked = 'E';
            onButtonClick();


        });
        flowPane.getChildren().add(e);
        //f
        Button f = new Button("F");
        f.setMaxWidth(33);
        f.setMinSize(33,26);
        f.setFont(new Font("Arial", 13));
        f.setOnAction(event -> {
            buttonClicked = 'F';
            onButtonClick();


        });
        flowPane.getChildren().add(f);
        //g
        Button g = new Button("G");
        g.setMaxWidth(33);
        g.setMinSize(33,26);
        g.setFont(new Font("Arial", 13));
        g.setOnAction(event -> {
            buttonClicked = 'G';
            onButtonClick();


        });
        flowPane.getChildren().add(g);
        //h
        Button h = new Button("H");
        h.setMaxWidth(33);
        h.setMinSize(33,26);
        h.setFont(new Font("Arial", 13));
        h.setOnAction(event -> {
            buttonClicked = 'H';
            onButtonClick();


        });
        flowPane.getChildren().add(h);
        //i
        Button i = new Button("I");
        i.setMaxWidth(33);
        i.setMinSize(33,26);
        i.setFont(new Font("Arial", 13));
        i.setOnAction(event -> {
            buttonClicked = 'I';
            onButtonClick();


        });
        flowPane.getChildren().add(i);
        //j
        Button j = new Button("J");
        j.setMaxWidth(33);
        j.setMinSize(33,26);
        j.setFont(new Font("Arial", 13));
        j.setOnAction(event -> {
            buttonClicked = 'J';
            onButtonClick();


        });
        flowPane.getChildren().add(j);
        //k
        Button k = new Button("K");
        k.setMaxWidth(33);
        k.setMinSize(33,26);
        k.setFont(new Font("Arial", 13));
        k.setOnAction(event -> {
            buttonClicked = 'K';
            onButtonClick();


        });
        flowPane.getChildren().add(k);
        //l
        Button l = new Button("L");
        l.setMaxWidth(33);
        l.setMinSize(33,26);
        l.setFont(new Font("Arial", 13));
        l.setOnAction(event -> {
            buttonClicked = 'L';
            onButtonClick();


        });
        flowPane.getChildren().add(l);
        //m
        Button m = new Button("M");
        m.setMaxWidth(33);
        m.setMinSize(33,26);
        m.setFont(new Font("Arial", 13));
        m.setOnAction(event -> {
            buttonClicked = 'M';
            onButtonClick();


        });
        flowPane.getChildren().add(m);
        //n
        Button n = new Button("N");
        n.setMaxWidth(33);
        n.setMinSize(33,26);
        n.setFont(new Font("Arial", 13));
        n.setOnAction(event -> {
            buttonClicked = 'N';
            onButtonClick();


        });
        flowPane.getChildren().add(n);
        //o
        Button o = new Button("O");
        o.setMaxWidth(33);
        o.setMinSize(33,26);
        o.setFont(new Font("Arial", 13));
        o.setOnAction(event -> {
            buttonClicked = 'O';
            onButtonClick();


        });
        flowPane.getChildren().add(o);
        //p
        Button p = new Button("P");
        p.setMaxWidth(33);
        p.setMinSize(33,26);
        p.setFont(new Font("Arial", 13));
        p.setOnAction(event -> {
            buttonClicked = 'P';
            onButtonClick();


        });
        flowPane.getChildren().add(p);
        //q
        Button q = new Button("Q");
        q.setMaxWidth(33);
        q.setMinSize(33,26);
        q.setFont(new Font("Arial", 13));
        q.setOnAction(event -> {
            buttonClicked = 'Q';
            onButtonClick();


        });
        flowPane.getChildren().add(q);
        //r
        Button r = new Button("R");
        r.setMaxWidth(33);
        r.setMinSize(33,26);
        r.setFont(new Font("Arial", 13));
        r.setOnAction(event -> {
            buttonClicked = 'R';
            onButtonClick();


        });
        flowPane.getChildren().add(r);
        //s
        Button s = new Button("S");
        s.setMaxWidth(33);
        s.setMinSize(33,26);
        s.setFont(new Font("Arial", 13));
        s.setOnAction(event -> {
            buttonClicked = 'S';
            onButtonClick();


        });
        flowPane.getChildren().add(s);
        //t
        Button t = new Button("T");
        t.setMaxWidth(33);
        t.setMinSize(33,26);
        t.setFont(new Font("Arial", 13));
        t.setOnAction(event -> {
            buttonClicked = 'T';
            onButtonClick();


        });
        flowPane.getChildren().add(t);
        //u
        Button u = new Button("U");
        u.setMaxWidth(33);
        u.setMinSize(33,26);
        u.setFont(new Font("Arial", 13));
        u.setOnAction(event -> {
            buttonClicked = 'U';
            onButtonClick();


        });
        flowPane.getChildren().add(u);
        //v
        Button v = new Button("V");
        v.setMaxWidth(33);
        v.setMinSize(33,26);
        v.setFont(new Font("Arial", 13));
        v.setOnAction(event -> {
            buttonClicked = 'V';
            onButtonClick();


        });
        flowPane.getChildren().add(v);
        //w

        Button w = new Button("W");
        w.setMaxWidth(33);
        w.setMinSize(33,26);
        w.setFont(new Font("Arial", 13));
        w.setOnAction(event -> {
            buttonClicked = 'W';
            onButtonClick();


        });
        flowPane.getChildren().add(w);

        //x
        Button x = new Button("X");
        x.setMaxWidth(33);
        x.setMinSize(33,26);
        x.setFont(new Font("Arial", 13));
        x.setOnAction(event -> {
            buttonClicked = 'X';
            onButtonClick();


        });
        flowPane.getChildren().add(x);
        //y
        Button y = new Button("Y");
        y.setMaxWidth(33);
        y.setMinSize(33,26);
        y.setFont(new Font("Arial", 13));
        y.setOnAction(event -> {
            buttonClicked = 'Y';
            onButtonClick();


        });
        flowPane.getChildren().add(y);
        //z
        Button z = new Button("Z");
        z.setMaxWidth(33);
        z.setMinSize(33,26);
        z.setFont(new Font("Arial", 13));
        flowPane.getChildren().add(z);
        z.setOnAction(event -> {
            buttonClicked = 'Z';
            onButtonClick();


        });
        flowPane.setPadding(new Insets(20,0,0,10));


        layout.addRow(3,flowPane);

        // end-flowpane

        //menu
        MenuBar menubar = new MenuBar();
        menubar.setMinWidth(675);
        menubar.setPrefSize(635,25);
        //file
        Menu file = new Menu("File");

        //close
        MenuItem save = new MenuItem("Save");
        save.setOnAction(event -> Save());
        file.getItems().add(save);
        menubar.getMenus().add(file);
        layout.setMargin(menubar,new Insets(0,0,20,0));
        layout.addRow(0,menubar);

        //end of menu
        //label incorrect
        Label incorrect = new Label("Incorrect letters:");

        layout.setMargin(incorrect,new Insets(30,0,0,0));
        layout.setConstraints(incorrect, 1, 0);
        layout.getChildren().add(incorrect);
        //incorrect -end
        //imageview

 //  Image image = new Image("stage1.png");



       iv1.setImage(new Image("stage1.png"));
      iv1.setFitHeight(248);
      iv1.setFitWidth(217);
       layout.setMargin(iv1,new Insets(50,0,0,40));

       layout.addRow(1,iv1 );

// imageview-end

        //listview
        ListView<Character> incorrectwords = new ListView<>();


        incorrectwords.setItems(wrongletters);
        incorrectwords.setPrefSize(200,200);

        layout.add(incorrectwords,1,1);
        incorrect.setPadding(new Insets(0,0,0,0));
        layout.setMargin(incorrectwords, new Insets(0,0,0,0));





        //end-listview

        //correct label
        Label correct = new Label("Correct letters:");
        layout.setConstraints(correct, 1, 2);
        layout.getChildren().add(correct);
        //end-correctlabel

        //letters hbox

        HBox hBox = new HBox(20);
        hBox.setPrefSize(200,100);


        letter1.setFont(new Font("Arial", 13));

        letter2.setFont(new Font("Arial", 13));

        letter3.setFont(new Font("Arial", 13));

        letter4.setFont(new Font("Arial", 13));

        letter5.setFont(new Font("Arial", 13));

        letter6.setFont(new Font("Arial", 13));

        letter7.setFont(new Font("Arial", 13));
        
        letter8.setFont(new Font("Arial", 13));
        hBox.getChildren().addAll(letter1,letter2,letter3,letter4,letter5,letter6,letter7,letter8);
        layout.setMargin(hBox,new Insets(40,0,0,40));
        layout.add(hBox,1,3);










    //non layout stuff below


        selectedgame = LoadSelect.Display();
        if(selectedgame == false){
            selectedWord = WordToGuess.Word();
            selectedWord = selectedWord.toUpperCase();
            System.out.println("Selected word is " + selectedWord);


            for (char chara : selectedWord.toCharArray()) {
                selectedwordList.add(chara);
            }
            if(selectedWord.length() == 5){
                letter6.setVisible(false);
                letter7.setVisible(false);
                letter8.setVisible(false);
            }
            if(selectedWord.length() == 6){
                letter7.setVisible(false);
                letter8.setVisible(false);
            }
            if(selectedWord.length() == 7){
                letter8.setVisible(false);
            }


            Scene scene = new Scene(layout,669,446);
            window.setScene(scene);




            if (selectedWord == null){
                System.out.println("Please choose a method of loading and difficulty !");
            }

            if(selectedWord != null){

                window.show();
            }

            scene.getStylesheets().add(Main.class.getResource("Viper.css").toExternalForm());
            window.show();


        }
        if (selectedgame == true){
            Load();


            imageCounter();



            Scene scene = new Scene(layout,669,446);
            window.setScene(scene);
            scene.getStylesheets().add(Main.class.getResource("Viper.css").toExternalForm());
            window.show();











        }

















    }


    public void onButtonClick(){







        System.out.println("The button clicked was: " + buttonClicked);
        if (  wrongletters.contains(buttonClicked) || correctletters.contains(buttonClicked)){

            System.out.println("This value is already been input");
            LetterAlreadyInput.display();
        }
        else{
            if(selectedWord.length() == 5){
                easydiff();
            }
            if(selectedWord.length() == 6){
                meddiff();
            }
            if(selectedWord.length() == 7){
               harddiff();
            }
            if(selectedWord.length() == 8){
                vharddiff();
            }

        }



        }
    public void easydiff(){

            String result = Character.toString(buttonClicked);

            if(buttonClicked == selectedwordList.get(0)){
                System.out.println("First letter");
                letter1.setText(result);
                correctletters.add(buttonClicked);
                System.out.println(correctletters.size());

            }
            if(buttonClicked == selectedwordList.get(1)){
                System.out.println("Second letter");
                letter2.setText(result);
                correctletters.add(buttonClicked);
                System.out.println(correctletters.size());
            }
            if(buttonClicked == selectedwordList.get(2)){
                System.out.println("Third letter");
                letter3.setText(result);
                correctletters.add(buttonClicked);
                System.out.println(correctletters.size());
            }
            if(buttonClicked == selectedwordList.get(3)){
                System.out.println("Forth letter");
                letter4.setText(result);
                correctletters.add(buttonClicked);
                System.out.println(correctletters.size());
            }
            if(buttonClicked == selectedwordList.get(4)){
                System.out.println("Fifth letter");
                letter5.setText(result);
                correctletters.add(buttonClicked);
                System.out.println(correctletters.size());
            }
            if (correctletters.size() == 5){
                gameover = GoodGameOver.display();


                if (gameover){
                   window.close();
                }
            }


            if (buttonClicked != selectedwordList.get(4) &&buttonClicked != selectedwordList.get(3) && buttonClicked != selectedwordList.get(2) && buttonClicked != selectedwordList.get(1) && buttonClicked != selectedwordList.get(0)  ){
                System.out.println("Incorrect letter");
                wrongletters.add(buttonClicked);
                imagecounter ++;


                imageCounter();
                }










            }
    public void meddiff(){

        String result = Character.toString(buttonClicked);

        if(buttonClicked == selectedwordList.get(0)){
            System.out.println("First letter");
            letter1.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());

        }
        if(buttonClicked == selectedwordList.get(1)){
            System.out.println("Second letter");
            letter2.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(2)){
            System.out.println("Third letter");
            letter3.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(3)){
            System.out.println("Forth letter");
            letter4.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(4)){
            System.out.println("Fifth letter");
            letter5.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(5)){
            System.out.println("Sixth letter");
            letter6.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }

        if (correctletters.size() == 6){
            gameover = GoodGameOver.display();


            if (gameover){
                window.close();
            }
        }


        if (buttonClicked != selectedwordList.get(5) && buttonClicked != selectedwordList.get(4) &&buttonClicked != selectedwordList.get(3) && buttonClicked != selectedwordList.get(2) && buttonClicked != selectedwordList.get(1) && buttonClicked != selectedwordList.get(0)  ){
            System.out.println("Incorrect letter");
            wrongletters.add(buttonClicked);
            imagecounter ++;


            imageCounter();
            }















    }
    public void harddiff(){

        String result = Character.toString(buttonClicked);

        if(buttonClicked == selectedwordList.get(0)){
            System.out.println("First letter");
            letter1.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());

        }
        if(buttonClicked == selectedwordList.get(1)){
            System.out.println("Second letter");
            letter2.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(2)){
            System.out.println("Third letter");
            letter3.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(3)){
            System.out.println("Forth letter");
            letter4.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(4)){
            System.out.println("Fifth letter");
            letter5.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(5)){
            System.out.println("Sixth letter");
            letter6.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(6)){
            System.out.println("Seventh letter");
            letter7.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }

        if (correctletters.size() == 7){
            gameover = GoodGameOver.display();


            if (gameover){
                window.close();
            }
        }


        if (buttonClicked != selectedwordList.get(6) && buttonClicked != selectedwordList.get(5) && buttonClicked != selectedwordList.get(4) &&buttonClicked != selectedwordList.get(3) && buttonClicked != selectedwordList.get(2) && buttonClicked != selectedwordList.get(1) && buttonClicked != selectedwordList.get(0)  ){
            System.out.println("Incorrect letter");
            wrongletters.add(buttonClicked);
            imagecounter ++;

            imageCounter();










        }




    }
    public void vharddiff(){

        String result = Character.toString(buttonClicked);

        if(buttonClicked == selectedwordList.get(0)){
            System.out.println("First letter");
            letter1.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());

        }
        if(buttonClicked == selectedwordList.get(1)){
            System.out.println("Second letter");
            letter2.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(2)){
            System.out.println("Third letter");
            letter3.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(3)){
            System.out.println("Forth letter");
            letter4.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(4)){
            System.out.println("Fifth letter");
            letter5.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(5)){
            System.out.println("Sixth letter");
            letter6.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(6)){
            System.out.println("Seventh letter");
            letter7.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if(buttonClicked == selectedwordList.get(7)){
            System.out.println("Eighth letter");
            letter8.setText(result);
            correctletters.add(buttonClicked);
            System.out.println(correctletters.size());
        }
        if (correctletters.size() == 8){
            gameover = GoodGameOver.display();


            if (gameover){
                window.close();
            }
        }


        if (buttonClicked != selectedwordList.get(7) && buttonClicked != selectedwordList.get(6) && buttonClicked != selectedwordList.get(5) &&buttonClicked != selectedwordList.get(4) &&buttonClicked != selectedwordList.get(3) && buttonClicked != selectedwordList.get(2) && buttonClicked != selectedwordList.get(1) && buttonClicked != selectedwordList.get(0)  ){
            System.out.println("Incorrect letter");
            wrongletters.add(buttonClicked);
            imagecounter ++;

            imageCounter();
            }










        }








    public void Save(){
    wordcounter1 = Integer.toString(imagecounter);



        for (int i = 0 ; i < wrongletters.size(); i++){
            wrongletterssave.add(wrongletters.get(i));
        }
        for (int i = 0 ; i < correctletters.size(); i++){
            correctletterssave.add(correctletters.get(i));
        }
        Savedata.add(0,correctletterssave);
        Savedata.add(1,wrongletterssave);



        System.out.println("Image state" + wordcounter1);
        subsaveData.add(0,wordcounter1);
           subsaveData.add(1,letter1.getText());
          subsaveData.add(2,letter2.getText());
           subsaveData.add(3,letter3.getText());
          subsaveData.add(4,letter4.getText());
          subsaveData.add(5,letter5.getText());
          subsaveData.add(6,letter6.getText());
          subsaveData.add(7,letter7.getText());
         subsaveData.add(8,letter8.getText());
        Savedata.add(2,selectedwordList);
         Savedata.add(3,subsaveData);

        System.out.println("Game saved");
        System.out.println("label 1 state " + letter1.getText());
        System.out.println("label 2 state " + letter2.getText());
        System.out.println("label 3 state " + letter3.getText());
        System.out.println("label 4 state " + letter4.getText());
        System.out.println("label 5 state " + letter5.getText());
        System.out.println("label 6 state " + letter6.getText());
        System.out.println("label 7 state " + letter7.getText());
        System.out.println("label 8 state " + letter8.getText());
        System.out.println("Image state " + wordcounter1);
        System.out.println("selected word " + selectedWord);


        try{
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\aspol\\IdeaProjects\\Hangman HCI Project Kerrigan\\src\\sample\\savedata.ser"));
            out.reset();
            out.writeObject(Savedata);
            out.flush();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }



    }


    public void Load(){


        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\aspol\\IdeaProjects\\Hangman HCI Project Kerrigan\\src\\sample\\savedata.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            LoadData = (ArrayList<List>) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException | ClassNotFoundException e  ){
            e.printStackTrace();
            return;
        }

        //getwrongletterslist
      for(int i = 0; i < LoadData.get(1).size(); i++){
         char x = (Character) LoadData.get(1).get(i);
        wrongletters.add(x);
          System.out.println("incorrect letters" + x);
      }
      //getrightletterslist
        for(int i = 0; i < LoadData.get(0).size(); i++){
            char x = (Character) LoadData.get(0).get(i);
            correctletters.add(x);
            System.out.println("correct letters " + x);
        }

      //getselectedword
        selectedwordList = LoadData.get(2);
        for(int i = 0; i < selectedwordList.size(); i ++){

          selectedWord += selectedwordList.get(i);
        }
        System.out.println("Selected word " + selectedWord);

        System.out.println(selectedwordList);
       imagecounter = Integer.parseInt((String)LoadData.get(3).get(0));
        System.out.println("image counter " + imagecounter);


        letter1.setText((String) LoadData.get(3).get(1));
        letter2.setText((String) LoadData.get(3).get(2));
        letter3.setText((String) LoadData.get(3).get(3));
        letter4.setText((String) LoadData.get(3).get(4));
        letter5.setText((String) LoadData.get(3).get(5));
        letter6.setText((String) LoadData.get(3).get(6));
        letter7.setText((String) LoadData.get(3).get(7));
        letter8.setText((String) LoadData.get(3).get(8));
        if(selectedWord.length() == 5){
            letter6.setVisible(false);
            letter7.setVisible(false);
            letter8.setVisible(false);
        }
        if(selectedWord.length() == 6){
            letter7.setVisible(false);
            letter8.setVisible(false);
        }
        if(selectedWord.length() == 7){
            letter8.setVisible(false);
        }





    }


    public void imageCounter() {
        if (imagecounter == 1) {
            iv1.setImage(new Image("stage2.png"));


        }
        if (imagecounter == 2) {
            iv1.setImage(new Image("stage3.png"));


        }
        if (imagecounter == 3) {
            iv1.setImage(new Image("stage4.png"));


        }
        if (imagecounter == 4) {
            iv1.setImage(new Image("stage5.png"));


        }
        if (imagecounter == 5) {
            iv1.setImage(new Image("stage6.png"));


        }
        if (imagecounter == 6) {
            iv1.setImage(new Image("stage7.png"));


        }
        if (imagecounter == 7) {
            iv1.setImage(new Image("stage8.png"));


        }
        if (imagecounter == 8) {
            iv1.setImage(new Image("stage9.png"));
            gameover = BadGameOver.display();


            if (gameover) {
                window.close();
            }

        }
    }

        public static void main (String[]args){
            launch(args);
        }
}

