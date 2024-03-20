// write a java program to print odd numbers upto N using iteration method

package Loops;
import java.util.Scanner;

public class OddUptoN {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int N = sc.nextInt();

        int num = 1;

        while (num <= N) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}