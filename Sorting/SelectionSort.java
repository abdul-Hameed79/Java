package Sorting;

import java.util.Scanner;
public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
   public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    // enter the size of array
    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();

    // create an array
    int arr[] = new int [size];

    // enter elements in the array 
    System.out.print("Elements before swap : ");
    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt(); 
    }

    // selection sorting
    // time complaxity is 0(n)
    for(int i=0; i<arr.length; i++){
        int smaller = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[smaller] > arr[j]){

                // swapp the elements
                int temp = arr[smaller];
                arr[smaller] = arr[j];
                arr[j] = temp;
            }
        }
    }
    // print the elements after sorting
    System.out.print("Elements after sawp : ");
    printArray(arr);
   } 
}