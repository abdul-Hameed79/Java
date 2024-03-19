package Functions;
import java.util.Scanner;

public class sumofNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Select a number: ");
            int num = sc.nextInt();

            // function call
            sumofN(num);
        }
    }

    public static int sumofN(int num) {
        int i, sum = 0;   // initial sum = 0
        if(num <= 1) {
            return num;
        }
        for(i=1; i<= num; i++) {
            sum += i;   // updated sum
        }
        System.out.println("sum is " + sum);   // print the updated sum 
        return sum;
    }
}