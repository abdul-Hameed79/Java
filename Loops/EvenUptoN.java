package Loops;
import java.util.Scanner;

public class EvenUptoN {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int N = sc.nextInt();

            int count = 0;

            for (int num=0; count < N; num++) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                    count++;
                }
            }

            // while (count < N) {
            //     if (num % 2 == 0) {
            //         System.out.print(num + " ");
            //         count++;
            //     }
            //     num++;
            // }



            // do {
            //     if (num % 2 == 0) {
            //         System.out.print(num + " ");
            //         count++;
            //     }
            //     num++;
            // } while (count < N);
        }
    }
}