package OOPS.Inheritance;

// Super class
class Parent {
    public void display() {
        System.out.println("Parent class");
    }
}

// Sub class
class Child extends Parent {
    public void display() {
        System.out.println("Child class");
    }
}

// Main.java
public class InheritanceExample {
    public static void main(String[] args) {
        Parent p = new Child();

        p.display();    // Output: Child class 
    }
}