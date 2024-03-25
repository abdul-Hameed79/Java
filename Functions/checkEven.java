package Functions;

public class checkEven {
    public static void main(String[] args) {
        int num = 15;
        // function call
        isEven(num);
    }
    public static void isEven(int num) {
         if (num % 2 == 0) {
            System.out.println(num + " is a Even number");
         } else {
            System.out.println("Sorry! you enterd a wrong number");
         }
    }
}