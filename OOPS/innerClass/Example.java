// Write a java program to access inner class with the help of outer class

package OOPS.innerClass;

class OuterClass {
    int x = 5;

    class InnerClass {
        int y = 10;
    }
}

public class Example {
    public static void main(String[] args) {

        // Create object for calling outer class
        OuterClass myOuter = new OuterClass();

        // Create object for calling inner class
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        int result = (myOuter.x + myInner.y);
        System.out.println("Sum is: " + result);
    }
}