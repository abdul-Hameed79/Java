
/* write a program to print the sum of numbers */
package Functions;

public class sum {
    public static int printSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 35;

        int result = printSum(num1, num2);

        System.out.println("sum is: " + result);
    }
}
