package Loops;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a name: ");
            String name = sc.nextLine();

            if(name.length() == 5 && name.charAt(0) == 'A') {
                break;
            }
        } while (true);
    }
}
// the above program executes until inputs length matches to 5 && input starts with name A,  if both conditions satisfied 
  // then program will stops execution .