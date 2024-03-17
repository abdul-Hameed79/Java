/* write a java program to print the student grade using conditional statements */

package ConditionalStatements;
import java.util.Scanner;

public class checkStudentGrade {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = obj.nextInt();

        if(marks > 90) {
            System.out.println("A+");
        } else if (marks <= 90 && marks > 80) {
            System.out.println("A");
        } else if (marks <= 80 && marks > 70) {
            System.out.println("B");
        } else if (marks <= 70 && marks > 60) {
            System.out.println("C");
        } else if (marks <= 60 && marks > 50) {
            System.out.println("D");
        } else if (marks <= 50 && marks > 45) {
            System.out.println("E");
        } else {
            System.out.println("FAIL");
        }
    }
}
