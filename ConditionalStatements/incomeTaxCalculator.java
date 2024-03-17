
/* write a java program to print a income tax calculator 
    Hint: if user income = 5L, No tax
          if user income, 5L < income > 10L, tax would be 20%
          if user income, 10 < income, tax would be 30%
 */

package ConditionalStatements;
import java.util.Scanner;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner salary = new Scanner(System.in);

        System.out.print("Enter user salary: ");
        int Salary = salary.nextInt();

        if(Salary <= 500000) {
            System.out.println("Your Tax is 0");
        } 
        else if (Salary >= 500000 && Salary <= 1000000) {
            float tax = (float)(Salary * 0.2);
            System.out.println("Your Tax is: " + tax);
        }
        else if (Salary > 1000000) {
            float tax = (float)(Salary * 0.3);
            System.out.println("Your Tax is: " + tax);
        }
    }
}