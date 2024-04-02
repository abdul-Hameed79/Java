package Strings;

public class Binarysearch {
    static int printTarget(String[] cars, String target) {
        int start = 0, end = cars.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            int compareResult = target.compareTo(cars[mid]);

            if(compareResult == 0) {
                return mid;
            } else if(compareResult > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] cars = {"BMW", "Audi", "Toyota", "RangeRover", "TATA"};
        String target = "Toyota";

        int result = printTarget(cars, target);

        if(result == -1) {
            System.out.print("Target not found");
        } else {
            System.out.print("Target found at index: " + result);
        }
    }
}