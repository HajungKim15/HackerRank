import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MiniMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        long sum = 0;
        long min, max, tmp;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        min = sum;
        max = -1;
        
        for(int i=0; i<arr.length; i++){
            tmp = sum - arr[i];
            
            if(tmp > max){
                max = tmp;
            }
            if(tmp < min){
                min = tmp;
            }
        }
        
        System.out.println(min+" "+max);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
