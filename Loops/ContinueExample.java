package Loops;

public class ContinueExample {
    public static void main(String[] args) {
        int i=1;

        do {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("RCB won the Trophy");
        } while (i < 5);
    }
}
