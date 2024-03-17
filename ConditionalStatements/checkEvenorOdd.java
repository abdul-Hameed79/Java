/* write a java program to check whether the given number is even or odd */

package ConditionalStatements;

public class checkEvenorOdd {
    public static void main(String[] args) {
        int num = 35;

        // code for to check the number is even or not
        if(num % 2 == 0) {
            System.out.print("The given number is even");
        }

        // code for to check the number odd or not
        if(num % 2 != 0) { 
            System.out.println(num + " is odd");
        } else {
            System.out.println("not defined");
        }
    }
}