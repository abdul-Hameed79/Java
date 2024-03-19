/* write a java program to print numbers until user enters a multile of 5 */

package Loops;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {
            // prompt the user to enter a char..
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                break;
            }
        } while (true);
    }
}