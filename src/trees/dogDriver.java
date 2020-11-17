package src.trees;
import java.util.Scanner;
public class dogDriver {
    public static void main(String args[])
    {
        Dog d1 = new Dog(14, "Carlos", "Big", true);

        Dog d2 = d1;

        d1.setAge(20);

        System.out.println(d2.getAge());

        int n = 10;

        int b = n;

        n = 20;

        System.out.println(b);

    }
}
