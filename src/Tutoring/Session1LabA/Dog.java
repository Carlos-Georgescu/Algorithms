package Tutoring.Session1LabA;

public class Dog {
    private String nameOfDog;
    private int ageInYears;
    private String breedOfDog;

    /**
     * @param name Name of dog
     * @param breed Breed of dog
     * @param age Age of dog
     */
    public Dog(String name, String breed, int age) {
        setNameOfDog(name);
        setBreedOfDog(breed);
        setAgeInYears(age);
    }


    /**
     * @param nameDog The name of the dog is set
     */

    public void setNameOfDog(String nameDog) {
        if (nameDog != null)
        {
            nameOfDog = nameDog;
        } else {
            throw new IllegalArgumentException(" name cannot be null or an empty String");
        }
    }

    /**
     * @param breedOfDog the breed of dog that needs to be set
     */
    public void setBreedOfDog(String breedOfDog) {
        if (breedOfDog != null) {
            this.breedOfDog = breedOfDog;
        } else {
            throw new IllegalArgumentException("name cannot be null or an empty String");
        }
    }

    /**
     * @param ageInYears the dog age in years is set
     */
    public void setAgeInYears(int ageInYears) {
        if (ageInYears > 0) {
            this.ageInYears = ageInYears;
        } else {
            throw new IllegalArgumentException("age cannot be 0 or less");
        }
    }

    /**
     * @return the age in years (getter method)
     */
    public int getAgeInYears() {
        return ageInYears;
    }

    /**
     * @return the the breed of dog (getter method)
     */
    public String getBreedOfDog() {
        return breedOfDog;
    }

    /**
     * @return the name of the dog (getter method)
     */
    public String getNameOfDog() {
        return nameOfDog;
    }

    /**
     * Displays everything about the dog
     */
    public void displayDetails()
    {
        System.out.println("Name of dog: "+nameOfDog+" Breed: "+breedOfDog+" Age:"+ageInYears);
    }

}
