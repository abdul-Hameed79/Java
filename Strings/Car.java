// write a java program to print all given cars

package Strings;

class Car {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Audi", "Toyota", "RangeRover", "TATA"};

        System.out.print("Given cars are: ");
        for(int i=0; i<cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
    }
}