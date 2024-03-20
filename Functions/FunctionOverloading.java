package Functions;

public class FunctionOverloading {
    public static void main(String[] args) {
       int sum1 = sum(3,4);
       System.out.println("sum of two numbers is: " + sum1);

       int sum2 = sum(3,5,1);
       System.out.println("sum of three numbers is: " + sum2);
    }
    // function overloading
    public static int sum(int a, int b) {
        return a + b;
    }
    // function overloading
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}