public class Example {
    public static int printcountO(int[] arr) {
        int count = 1;
        int i = arr[0];

        for(i=1; i<arr.length; i++) {
            if (arr[i] > i)
            count++;
            i = arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 4, 9};

        System.out.println("The final count is: " + printcountO(arr));
    }
}

