package ca.bcit.comp1451.session2.labB;

public class Games {
    public static final int ROUND_NUMBER = 11;

    Dice die = new Dice();

    public void playChicago() {
        //index
        int index = 0;
        while(index < ROUND_NUMBER) {
            int roundCounter = index+2;

            int firstDice = die.roll();
            int secondaryDice = die.roll();

            System.out.println("Round number: "+ roundCounter);
            System.out.println("First die value was "+ firstDice);
            System.out.println("Second die value was "+ secondaryDice);

            if ((firstDice + secondaryDice) == roundCounter) {
                System.out.println("Points earned 1");
            }
            //next index
            index++;
        }

    }


}