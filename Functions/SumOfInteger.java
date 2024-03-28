package Functions;

public class SumOfInteger {
    public static void countNum(int n) {
        int revNum = 0;

        while(n != 0) {
            int rem = n % 10;
            revNum = revNum + rem;
            n /= 10;
        }
        System.out.print(revNum);
    }

    public static void main(String[] args) {
        countNum(3981);
    }
}
