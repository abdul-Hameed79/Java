// Functional Interface program supports lambda expression

package OOPS.Interface;

@FunctionalInterface
interface A {
    void display();
}

// Main.java
public class Demo {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Output...");  // Lambda expression...

        obj.display();
    }
}