// write a java program to chech given number is prime or not using function.

package Functions;
import java.util.Scanner;

public class checkkPrime {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int N = sc.nextInt();

        // function calling
        isprime(N);
        
    }
    public static void isprime(int N) {
        int count = 0;
        for (int i=1; i<= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(N + " is prime");
        } else {
            System.out.println(N + " is not prime");
        }
    }
}