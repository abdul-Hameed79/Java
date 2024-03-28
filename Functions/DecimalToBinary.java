// write a java program to convert decimal value into binary value by usng function method

package Functions;

public class DecimalToBinary {
    public static void main(String[] args) {
        ConvDecToBin(15);
    }

    public static void ConvDecToBin(int DecNum) {
        int myNum = DecNum;
        int BinNum = 0;
        int pow = 0;

        while(DecNum > 0) {
            int rem = DecNum % 2;
            BinNum = (int)(BinNum + rem*Math.pow(10, pow));  // for arranging the rem in proper order to use math.pow function

            pow++;
            DecNum = DecNum/2;
        }
        System.out.print("Binary value of " + myNum + "= " + BinNum);
    }
}