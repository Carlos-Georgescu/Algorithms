package ca.bcit.comp1451.session2.labB;
import java.util.*;

public class Dice {
    private int faceValue;
    //Random object
    private Random random;

    public Die() {
        random = new Random();
        roll();
    }

    public int roll() {
        //get random value
        faceValue = random.nextInt(10 - 1 + 1) + 1;
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }
}
