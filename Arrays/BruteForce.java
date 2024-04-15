// write a java program to print sum of maxSubArray by using Brute Force method
// Time Complexity is   worst case --> O(n3);   Space compexity is --> O(1)
package Arrays;

public class BruteForce {
    // Function to find Max Value of a sub array
    public static void maxSubArraySum(int[] arr) {
        int  maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {      // 2, 4, 6, 8, 10
            for(int j=i; j<arr.length; j++) {  // 2, 4, 6, 8, 10
                int CurrentSum = 0;
                for(int k=i; k<=j; k++) {      // 2,   2 4,   2 4 6,   2 4 6 8,   2 4 6 8 10
                    CurrentSum += arr[k];      // 2, 6, 12, 20, 30
                }
                if(CurrentSum > maxSum) {      // 30 > MIN_VALUE
                    maxSum = CurrentSum;       // maxSum = 30 
                }
            }
        }
        System.out.println("Maximum sum of sub array is: " + maxSum);
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        // Function call
        maxSubArraySum(arr);
    }
}