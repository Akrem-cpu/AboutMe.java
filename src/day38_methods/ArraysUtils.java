package day38_methods;

import java.util.Arrays;

public class ArraysUtils {
    public static void PrintArray(int [] num){
        for (int each : num) {
            System.out.print( each + " ");

        }
        System.out.println();

    }

    public   static int sum (int[] num ){
        int sum=0;
        for (int each : num) {
            sum+=each;

        }
        return sum;
    }

    public static boolean Contains(int[] nums,int[] num){
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (num[i] == nums[j]){
                    count++;
                }

            }
            if (count == num.length){
                break;
            }
        }
        if (count == num.length){
            return true;
        }
        return false;
    }



}
