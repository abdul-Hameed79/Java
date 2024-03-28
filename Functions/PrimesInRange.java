// write a java program to print prime numbers in a range

package Functions;
import java.util.Scanner;

public class PrimesInRange {
    // Direct method...
    // public static void main(String[] args) {
    //     int start = 10;
    //     int end = 100;

    //     for (int i=start; i<=end; i++) {
    //         if (isPrime(i)) {
    //             System.out.print(i + " ");
    //         }
    //     }
    // }

    public static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void count(int start, int end) {
        for (int i=start; i<=end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input taking from user...
        System.out.print("Enter Start value: ");
        int start = sc.nextInt();

        System.out.print("Enter End value: ");
        int end = sc.nextInt();

        sc.close();

        // function call
        count(start, end);

    }
}