// write a java program to find the smallest element present in an array

package TcsNQT_Preparation;

public class SecondProblem {
    public static int SmallestElement(int[] arr) {
        int minNum = arr[0];
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i+1] < minNum) {
                minNum = arr[i+1];
                return minNum;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,7,3,1};

        System.out.println("The smallest element present in the array is: " + SmallestElement(arr));
    }
}