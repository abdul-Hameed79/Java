
/* write a java program to check whether given number is prime or not */

package Loops;

public class isPrime {
    public static void main(String[] args) {
        int num = 37;
        int count = 0;

        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}
