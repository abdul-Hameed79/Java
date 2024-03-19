package Operators;

public class problem1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int res1 = (x * y / x);
        int res2 = (x * (y / x));

        System.out.println(res1);
        System.out.println(res2);
    }
}