import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus {
	/*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        float plus=0, minus=0, zero=0;
        int len=arr.length;
        
        for(int i=0; i<len; i++){
            if(arr[i]>0){
                plus++;
            }else if(arr[i]<0){
                minus++;
            }else{
                zero++;
            }
        }
        
        System.out.printf("%f \n", plus/len);
        System.out.printf("%f \n", minus/len);
        System.out.printf("%f \n", zero/len);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
