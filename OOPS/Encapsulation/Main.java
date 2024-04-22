package OOPS.Encapsulation;

class Person {
    // private data
    private String name;   
    private int age;

    // getters to get the data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters to set the data
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // create an object to call the data
        Person myObj = new Person();
        
        // set data
       myObj.setName("Hameed");
       myObj.setAge(21);

       // Display data
       System.out.println("Name: " + myObj.getName() + "\nAge: " + myObj.getAge());
    }
}