package Variables;

public class MathwithVariables {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'r';
        short s = 520;
        int i = 25;
        float f = 34.5f;
        double d = 45.6;
        long l = 13456;

        double result = (f*b) + (i*d) + (d+s) * (l-s) / (c);
        System.out.println(result);
    }
}
/* just observe one thing in this code, i have used double data type the result, 
   because when compare to all other data types double is the bigger one so i have declared with it */