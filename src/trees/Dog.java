package src.trees;

public class Dog {
    private int age;
    private String name;
    private String size;
    private boolean sleeping;


    public Dog()
    {
        age = 10;
        name = "Joshua";
        size = "Medium";
        sleeping = false;
    }

    public Dog(int age, String name, String size, boolean sleeping)
    {
        this.age = age;
        this.name = name;
        this.size = size;
        this.sleeping = sleeping;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(int n1, int n2)
    {
        age = n1*n2;
    }

    public void setAge(double age)
    {
        this.age = (int) age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public int changeInt(int num)
    {
        num++;
        return num;
    }

    public String toString()
    {
        //FORMAT: Age then name then size
        return age+name+size;
    }
}
