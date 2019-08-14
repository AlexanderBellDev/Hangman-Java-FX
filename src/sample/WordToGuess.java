package sample;

import javafx.scene.control.ListView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aspol on 01/12/2016.
 */
public class WordToGuess {
  public static   boolean result;
   public static String difficulty;
    public static int randomNumA;
    public static int randomNumB;
    public static int randomNumC;
    public static int randomNumD;
    public static String ret;
    public static String word;
    public static String wordtoRet;
   public static ArrayList<List> Listofwords = new ArrayList<>();
    public static ObjectOutputStream out;

public static String  Word() throws  IOException{

    result = OptionSelect.Display();
    difficulty = DifficultySelect.Display();
    randomNumA = NumberSelector.numgenA();
    randomNumB = NumberSelector.numgenB();
    randomNumC = NumberSelector.numgenC();
    randomNumD = NumberSelector.numgenD();

    Listofwords.add(Easy());
    Listofwords.add(Medium());
    Listofwords.add(Hard());
    Listofwords.add(Very_Hard());

    serialize();









    //result = true is sequential

    if(result){
    //    System.out.println("Method is sequential");

     //   System.out.println("The selected difficulty is " + difficulty);
        if(difficulty == "A"){
            DiffA();
        }
        else if(difficulty == "B"){
            DiffB();
        }
        else if(difficulty == "C"){
            DiffC();
        }
        else if(difficulty == "D"){
            DiffD();
        }
    }







return  word;


    }








    public  static List<String> Easy() throws IOException{
        int counter = 0;



        List<String> arrlist = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Users\\aspol\\IdeaProjects\\HCI_Project\\src\\file1.txt"));



        while (true) {
            counter ++;

            String line = reader.readLine();
            if (line == null) {
                break;
            }

            if(counter >= 0) {
                arrlist.add(line);

            }




        }

        reader.close();

        System.out.println("Words: " + arrlist.size());




        return (arrlist);

    }
    public  static List<String> Medium() throws IOException{
        int counter = 0;



        List<String> arrlist = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Users\\aspol\\IdeaProjects\\HCI_Project\\src\\file2.txt"));



        while (true) {
            counter ++;

            String line = reader.readLine();
            if (line == null) {
                break;
            }

            if(counter >= 0) {
                arrlist.add(line);

            }




        }

        reader.close();

        System.out.println("Words: " + arrlist.size());
        return (arrlist);

    }
    public  static List<String> Hard() throws IOException{
        int counter = 0;




        List<String> arrlist = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Users\\aspol\\IdeaProjects\\HCI_Project\\src\\file3.txt"));



        while (true) {
            counter ++;

            String line = reader.readLine();
            if (line == null) {
                break;
            }

            if(counter >= 0) {
                arrlist.add(line);

            }




        }

        reader.close();

        System.out.println("Words: " + arrlist.size());

       /* for(String line: 5){
            System.out.println(line);
         }
          System.out.println(arrlist.get(50));
        for(int j = number1; j<=number2; j++){
            System.out.println(arrlist.get(j));
        }

        */


        return (arrlist);

    }
    public  static List<String> Very_Hard() throws IOException{
        int counter = 0;




        List<String> arrlist = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Users\\aspol\\IdeaProjects\\HCI_Project\\src\\file4.txt"));



        while (true) {
            counter ++;

            String line = reader.readLine();
            if (line == null) {
                break;
            }

            if(counter >= 0) {
                arrlist.add(line);

            }




        }

        reader.close();

        System.out.println("Words: " + arrlist.size());




        return (arrlist);

    }




        public static void DiffA(){
        if (difficulty == "A") {
         //   try {

            //    System.out.println();
                word = (String) Listofwords.get(0).get(randomNumA);

               // word = Easy(randomNumA,randomNumA+1);
            //    System.out.println("The selected word is " + word);


            //} catch (IOException e) {
            //    e.printStackTrace();
          //  }


        }
    }
        public static void DiffB(){
            if(difficulty == "B"){
            //    try{

                    word = (String) Listofwords.get(1).get(randomNumB);
                   // System.out.println("Selected word is" + word);

              //  }
              //  catch (IOException e){
              //      e.printStackTrace();
              //  }


            }
        }
        public static void DiffC(){
            if(difficulty == "C"){
               // try{
                    word = (String) Listofwords.get(2).get(randomNumC);
                  //  System.out.println("Selected word is" + word);

              //  }
              //  catch (IOException e){
             //       e.printStackTrace();
               // }


            }
        }
        public static void DiffD(){
            if(difficulty == "D"){
            //    try{
                    word = (String) Listofwords.get(3).get(randomNumD);

             //   }
            //    catch (IOException e){
             //       e.printStackTrace();
             //   }

            }
        }


        public static void serialize() {
            try{
                out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\aspol\\IdeaProjects\\Hangman HCI Project Kerrigan\\src\\sample\\listofwords.ser"));
                out.writeObject(Listofwords);
                out.flush();
                out.close();
            }catch (IOException e){
                e.printStackTrace();
            }


        }



    }








