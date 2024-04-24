// Write a java program to show the differences between public vs static methods

package OOPS;

public class publicVSstatic {

    // Staic Method
    static void mystaticMethod() {
        System.out.println("Static method can be called without creating objects");
    }

    // Public Method
    public void mypublicMethod() {
        System.out.println("Public method can be called by creation objects");
    }

    // Main.java
    public static void main(String[] args) {
        mystaticMethod(); // static method called without the help of any objects

        publicVSstatic myobj = new publicVSstatic();
        myobj.mypublicMethod();  // public method called with the help of object
    }
}