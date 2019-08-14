package sample;

import java.util.Date;
import java.util.Random;

/**
 * Created by aspol on 01/12/2016.
 */
public class NumberSelector {

public static int randomint;
public static String diff;

    public static int getRandomint(){

    diff = WordToGuess.difficulty;
    if(diff == "A"){
        numgenA();
    }

    if(diff =="B"){
        numgenB();
    }


    if(diff =="C"){
        numgenC();
    }


    if(diff =="D"){
        numgenD();
    }


     return randomint;
 }

    public static int numgenA() {

        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 2; ++idx) {
            randomint = randomGenerator.nextInt(8937);

        }
        return randomint;
    }

    public static int numgenB() {

        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 2; ++idx) {
            randomint = randomGenerator.nextInt(15787);

        }
        return randomint;
    }

    public static int numgenC() {

        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 2; ++idx) {
            randomint = randomGenerator.nextInt(24028);

        }
        return randomint;
    }

    public static int numgenD() {

        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 2; ++idx) {
            randomint = randomGenerator.nextInt(29765);

        }
        return randomint;
    }
}
