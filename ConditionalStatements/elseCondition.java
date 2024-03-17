/* write a program to print given condition is true of false */

// package ConditionalStatements;

// public class elseCondition {
//     public static void main(String[] args) {
//         String city = "Hyderabad";

//         if(city == "Delhi") {
//             System.out.println("False");
//         } else if (city == "Hyderabad") {
//             System.out.println("True");
//         } else {
//             System.out.println("Unexpected Error");
//         }
//     }
// }

/* write a program to print the largest number */

package ConditionalStatements;

class elseCondition {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 70;

        if(a > b && a> c) {
            System.out.println(a + " is greater");
        } else if(b > c) {
            System.out.print(b + " is grater");
        } else {
            System.out.println(c + " is grater");
        }
    }
}
