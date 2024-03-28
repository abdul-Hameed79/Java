// write a java program to reverse a given number
package Functions;

public class ReverseNumber {
    static int reverse(int num) {
        int rem, revNum = 0;
        // loop to reverse the number
        while(num > 0) {
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        System.out.print(reverse(3512)); // function call
    }
}