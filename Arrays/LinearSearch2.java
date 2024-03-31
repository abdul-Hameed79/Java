package Arrays;

public class LinearSearch2 {
    static int foundTarget(String[] names, String target) {
        for(int i=0; i < names.length; i++) {
            if(names[i] == target) {
              return i;  
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"H", "N", "W", "X"};
        String target = "W";

        int result = foundTarget(names, target);

        if(result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}