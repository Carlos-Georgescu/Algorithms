package Tutoring;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ArrayList<String> list = new ArrayList<String>();
        String line = null;
        while(!(line = scanner.nextLine()).isEmpty()) {
            list.add(line);
        }

        System.out.println(list.get(2));
    }
}
