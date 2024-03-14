package Sorting;

import java.util.Scanner;
public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Enter the size of the array
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        // create an array
        int arr[] = new int [size];

        // prompt the user to enter the elements
        System.out.print("Elements before swapping : ");

        // loop for arrange the elements in order
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        // Bubble sorting
        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){

                    // swap the elements in descending order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // print the final output
        System.out.print("Elements after swapping : ");
        printArray(arr);
    }
}