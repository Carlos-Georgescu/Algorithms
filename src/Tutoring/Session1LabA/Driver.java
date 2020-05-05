package Tutoring.Session1LabA;

public class Driver {
    public static void main(String args[])
    {
        int year = Integer.parseInt(args[2]);
        int secondYear = Integer.parseInt(args[5]);
        Dog dog = new Dog(args[0], args[1], year);
        Dog otherDog = new Dog(args[3], args[4], secondYear);

        Kennel kennel = new Kennel();
        kennel.addDog(dog);
        kennel.addDog(otherDog);

        kennel.displayDogs();
        kennel.adopt("Steven");
        System.out.println("After adoption list: ");
        kennel.displayDogs();
    }
}
