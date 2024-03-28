// write a java program to convert Binary numbers into Decimal numbers 

package Functions;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter input
        System.out.print("Enter Binary number: ");
        int BinNum = sc.nextInt();

        sc.close();

        // function call
        ConBinToDec(BinNum);
    }
    
    public static void ConBinToDec(int BinNum) {
        int MyNum = BinNum;
        int Pow = 0;
        int Dec = 0;

        while(BinNum > 0) {
           int last = BinNum % 10;
           Dec = (int)(Dec + last*Math.pow(2, Pow));

           Pow++;
           BinNum = BinNum/10;
        }
        System.out.print("Binary num of " + MyNum + " = " + Dec);
    }
}