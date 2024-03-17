/* write a java program to create a simple calculator */

package ConditionalStatements;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
            double num1, num2, result;
            char operator;

            System.out.print("Enter first number: ");
            num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            num2 = sc.nextInt();

            System.out.print("Select operator: ");
            operator = sc.next().charAt(0);

        switch(operator) {
            case '+': result = num1 + num2; System.out.print("sum is: " + result); break;

            case '-': result = num1 - num2; System.out.print("sub is: " + result); break;

            case '*': result = num1 * num2; System.out.print("mul is: " + result); break;

            case '/': 
            if(num2 != 0) {
                result = num1 / num2; 
                System.out.print("div is: " + result);
            } else {
                System.out.println("Error");
            } break;

            case '%': result = num1 % num2; System.out.print("rem is: " + result); break;

            default: System.out.println("Unexpexted error");
        }
        System.out.print("\nThank you! Have a nice day");
    }
}