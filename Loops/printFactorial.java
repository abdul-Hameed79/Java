package Loops;
import java.util.Scanner;

public class printFactorial {
    public static void main(String[] args) {
        // direct method..
    //    int num = 5;
    //    int fact = 1;

    //    for(int i=1; i<=num; i++) {
    //     fact *= i;
    //    }
    //    System.out.println("factorial of " + num + " is " + fact);

       // user input method..
       
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num <= 0) {
            return;
        }
        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact *= i; 
        }
        System.out.println(fact);
    }
}