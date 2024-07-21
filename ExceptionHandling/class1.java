package ExceptionHandling;

public class class1 {
    public static void main(String[] args) {
        int numOne = 6;
        int numTwo = 0;
        int result = 1;

        try {
            // Here I'm trying to divise with 0, so it will throughs an exception
            result = numOne / numTwo;
        } catch (ArithmeticException e) {
            // Here I'm handling the exception by using try and catch block
            System.out.println("something went wrong " + e);
        }

        System.out.println(result);
        System.out.println("Got it!");
    }
}
