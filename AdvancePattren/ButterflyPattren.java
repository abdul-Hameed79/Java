package AdvancePattren;

import java.util.Scanner; // Import Scanner class

public class ButterflyPattren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the size of the butterfly: "); // Prompt for user input
        int size = scanner.nextInt(); // Read the size from the user

        // function call
        printButterfly(size);
        scanner.close(); // Close the scanner
    }

    public static void printButterfly(int size) {
        // Print the upper half of the butterfly
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) { // Print left wing
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (size - i); j++) { // Print space between wings
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // Print right wing
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower half of the butterfly
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) { // Print left wing
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (size - i); j++) { // Print space between wings
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // Print right wing
                System.out.print("*");
            }
            System.out.println();
        }
    }
}