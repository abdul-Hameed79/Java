    /* write a java program to find the largest number in an array */     

package Arrays;

public class ForEachLoop {

    public static int maximum(int[] numbers) 
    {  
        int maxNum = numbers[0]; 
          
        // for each loop 
        for (int i : numbers)  
        { 
            if (i > maxNum) 
            { 
                maxNum = i;
            } 
        } 
    return maxNum; 
    } 

    public static void main(String[] arg) 
    { 
        { 
            int[] marks = { 125, 132, 95, 116, 110 }; 
              
            System.out.println("The highest marks are " + maximum(marks)); 
        } 
    } 
}