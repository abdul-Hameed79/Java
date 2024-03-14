/* 
    Ok let's solve some problems on this topic and then we will understand Variables very clearly.

    Question 1: Take two values as input from user A and B , and print the sum of it.

*/

package Variables;

import java.util.Scanner;
public class FindSum {
    public static void main(String[] args) {
        // Method 1.Taking input directly
        // int a = 20;
        // int b = 30;

        // int result = a + b;
        // System.out.print("sum is: " + result);

        // Methos 2. Taking input from user
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a value: ");
            int a = sc.nextInt();

            System.out.print("Enter b value: ");
            int b = sc.nextInt();

            int sum = a + b;

            // print the output
            System.out.print("sum is: " + sum);
        }
    }
}

/* it is the basic problem, after understanding it, u can practice many problems on this model,
    ex: product of numbers, division of numbers and find avarage btw given numbers.
*/


