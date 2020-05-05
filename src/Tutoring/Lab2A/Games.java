
import java.util.Scanner;
import java.util.ArrayList;

public class Games {
    private Scanner input;

    //constructor
    public Games() {
        input = new Scanner(System.in);
    }

    public void textParser() {

        System.out.println("Please enter a line of text:");

        //list for int
        ArrayList<Integer> intList = new ArrayList<Integer>();
        //list for double
        ArrayList<Double> doubleList = new ArrayList<Double>();
        //list for Strings
        ArrayList<String> stringList = new ArrayList<String>();

        while(input.hasNext()) {
            if (input.hasNextDouble()) {
                double numberDouble = input.nextDouble();
                doubleList.add(numberDouble);
            } else if (input.hasNextInt()) {
                int number = input.nextInt();
                intList.add(number);
            } else {
                String word = input.next();
                stringList.add(word);
            }
        }



        System.out.println("Number of words: " + stringList.size());
        System.out.println("Word list: " + stringList);

        System.out.println("Number of numbers: " + intList.size());
        System.out.println("Int list: " + intList);
        //output number of doubles
        System.out.println("Number of doubles: " + doubleList.size());
        System.out.println("Double list: " + doubleList);

        //close scanner
        input.close();
    }

}