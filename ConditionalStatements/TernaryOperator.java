package ConditionalStatements;

public class TernaryOperator {
    public static void main(String[] args) {
        int num = 24;

        String type = ((num % 2) == 0) ? "even" : "odd";
        System.out.println(num + " is " + type);
    }
}