
/* write a program to print Multiplication table using java */
package Loops;

public class Table {
    public static void main(String[] args) {
        int num = 5;

        for(int i=1; i<=10; i++) {
            int result = num*i;
            System.out.print(result + " ");
        }
    }
}
