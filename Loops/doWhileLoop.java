package Loops;

public class doWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("This is a do while loop code");
            count++;
        } while (count <= 5);
    }
}

/* ok let's decode the syntx:

    int count = 1  --> initial condition
    do { // code }  --> write here what do u want to print
    count++;  --> updation
    while (count <= 5)  --> condition for where to stop the loop
    
 */