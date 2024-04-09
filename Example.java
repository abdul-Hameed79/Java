public class Example {
    public static int printcount(int[] arr) {
        int count = 1;
        int maxNum = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (arr[i] > maxNum)
            count++;
            maxNum = arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 4, 9};

        System.out.println("The final count is: " + printcount(arr));
    }
}