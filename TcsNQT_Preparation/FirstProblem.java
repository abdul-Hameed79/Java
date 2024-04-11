// Given an array of integers whose size is N, count how many elements are greater when compare to their previous one
// Initially count start with 1 at arr[0]

package TcsNQT_Preparation;
import java.util.Scanner;

public class FirstProblem {
    // Function to calculate Count of array
    public static int printCount(int[] arr) {
        int count = 1, maxNum = arr[0];

        for(int i=1; i<arr.length; i++) {
    // Condition checking whether number is greater or not
            if(arr[i] > maxNum) {
                count++;
                maxNum = arr[i]; // Swap
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Prompt the user to enter the array size
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Given Array is: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

    // Function call
        System.out.println("Count of the array is: " + printCount(arr));
    }
}