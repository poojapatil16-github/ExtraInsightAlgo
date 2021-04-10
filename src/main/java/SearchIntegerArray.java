
// Java program to check if given array
// has 2 elements whose sum is equal
// to the given value
import java.util.*;

public class SearchIntegerArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of array");
        int length = sc.nextInt();

        // create a String array to save user input
        int[] input = new int[length];

        // loop over array to save user input
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++) {
            int userInput = Integer.parseInt(sc.next());
            input[i] = userInput;
        }
        System.out.println("Please enter element to search");
        int noToSearch = Integer.parseInt(sc.next());
        boolean flag= Boolean.FALSE;
        for (int i = 0; i < length; i++) {
            if(input[i]==noToSearch){
                System.out.println("Position of the number is"+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("No not present in the gien array");
        }

        sc.close();
    }
}