// write a java program to reverse a given number

package Loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 258179;

        while (num > 0) {
            int result = num % 10;
            num = num / 10;
            System.out.print(result + " ");
        }
    }
}