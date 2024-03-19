package Loops;

public class BreakExample {
    public static void main(String[] args) {

        // with for loop..
        // for(int i=1; i<= 5; i++) {
        //     if(i==3) {
        //         break;
        //     }
        //     System.out.println(i);  // output would be 1, 2. Because break ketword stop the iteration when i=3.
        // }

        // with while loop
        int count = 1;
        while (count <= 5) {
            System.out.println("keep practicing");
            count++;

            if (count == 3) {
                break;
            }
        }
    }
}