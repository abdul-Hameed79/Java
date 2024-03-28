package Functions;
public class BinomialCoefficient {

    // Function to calculate factorial
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    // Function to calculate binomial coefficient
    static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Main method
    public static void main(String[] args) {
        int n = 7; // Change this to the desired value of n
        int k = 2; // Change this to the desired value of k
        int result = binomialCoefficient(n, k);
        System.out.println("Binomial coefficient C(" + n + ", " + k + ") is: " + result);
    }
}