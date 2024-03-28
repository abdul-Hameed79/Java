// write a java program to print the sum of numbers in an interger

package Functions;

public class SumOfInteger {
    // function to calculate the sum of intergers in a given interger
    public static void countNum(int n) {
        int revNum = 0;
        // adding the numbers
        while(n != 0) {
            int rem = n % 10;
            revNum = revNum + rem;
            n /= 10;
        }
        System.out.print(revNum);
    }

    public static void main(String[] args) {
        // function call
        countNum(3981);
    }
}