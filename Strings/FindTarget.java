// write a java program to find the target using linear search

package Strings;

class FindTarget {
    // function to calculate linear search
    static int Linear_search(String[] cars, String target) {
        for(int i=0; i<cars.length; i++) {
            if(cars[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Main.java
    public static void main(String[] args) {
        String[] cars = {"BMW", "Audi", "Toyota", "RangeRover", "TATA"};
        String target = "RangeRover";

        System.out.print("Target found at index: " + Linear_search(cars, target)); // function call
    }
}