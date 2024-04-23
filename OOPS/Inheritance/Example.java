package OOPS.Inheritance;

// Super class
class Vehicle {
    protected String brand = "Audi";    // Vehicle attribute
    protected String model = "R8";      // Vehicle attribute
}

// Sub class
class Car extends Vehicle {
    protected int year = 2017;  // Car attribute
}

public class Example {
    public static void main(String[] args) {
        // create a mycar object
        Car mycar = new Car();
        
        // Display the brand and model names from vehicle class & year from car class
        System.out.println("Brand: " + mycar.brand + "  " + "\nModel: " + mycar.model + "  " + "\nLaunch year: " + mycar.year);
    }
}