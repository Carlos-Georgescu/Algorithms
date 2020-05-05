package Tutoring.Session1LabA;

import java.util.ArrayList;
import java.util.Iterator;


public class Kennel {

    private ArrayList<Dog> dogs;

    public Kennel() {
        dogs = new ArrayList<Dog>();
    }

    /**
     *
     * @param theDog the dog that will be added
     */
    public void addDog(Dog theDog) {
        if (theDog != null) {
            dogs.add(theDog);
        } else {
            throw new IllegalArgumentException("Dog values cannot be null");
        }

    }


    public void displayDogs() {
        for (Dog kennelDog : dogs) {
            System.out.println(kennelDog.getNameOfDog());
            System.out.println(kennelDog.getBreedOfDog());
            System.out.println(kennelDog.getAgeInYears());
        }
    }

    /**
     *
     * @param name Searches for a dog with the given name
     */
    public void adopt(String name) {
        Boolean foundDog = false;
        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()) {
            Dog oneDog = iterator.next();
            if (oneDog.getNameOfDog().equals(name)) {
                System.out.println(oneDog.getNameOfDog());
                System.out.println(oneDog.getBreedOfDog());
                System.out.println(oneDog.getAgeInYears());
                //remove it
                iterator.remove();
                foundDog = true;
            }
        }
        if(foundDog==false)
            System.out.println("There is no dog with the given name in this collection");
    }
}
