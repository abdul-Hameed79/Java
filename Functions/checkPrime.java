
/* write a java program to check ehrther given number is prime or not */

package Functions;
import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // function call
        isPrime(num);
    }

    // function declaration
    public static boolean isPrime(int num) {
        if(num <= 0) {
            return false;
        }
        int count = 0;
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
        return count == 2;
    }
}