package day38_methods;

import java.util.Arrays;
import java.util.Locale;

public class StringUtils {
    public static boolean isNullOrEmpty(String str){
        return (str == null || str.isEmpty());

    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        boolean a = false;

        for (int i = 0; i < str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return a;
            }
        }
        a = true;
        return a;



    }
    public static String reverse(String str){
        String temp = "";
        for (int i = str.length()-1; i  >= 0 ; i--) {
            temp += str.charAt(i);

        }
        return temp;
    }
    public static void printArray(int[] nums ){
        System.out.println(Arrays.toString(nums));

    }
}
