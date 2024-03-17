/* Write a java proggram to take some inputs from the user and print the data type of the inputs */

package DataTypes;

import java.util.Scanner;
class DataTypeFinder {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            // Declare variable of different data types
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            System.out.print("Enter a value: ");
            double value = sc.nextDouble();

            System.out.print("Enter a name: ");
            String name = sc.next();

            // print the data types of variables
            System.out.println("Number is: " + number);
            System.out.println("value is: " + value);
            System.out.println("name is: "+ name);

        } 
    }
}