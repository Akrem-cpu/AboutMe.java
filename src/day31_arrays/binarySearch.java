package day31_arrays;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int [] nums = {23, 123 , 654, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums , 23));
        System.out.println(Arrays.binarySearch(nums , 123));
        System.out.println(Arrays.binarySearch(nums , 654));
        System.out.println(Arrays.binarySearch(nums , 12345));
        System.out.println(Arrays.binarySearch(nums ,14421));

        if (Arrays.binarySearch(nums, 12345) == 3){
            System.out.println("true");
        }else {
            System.out.println("false ");
        }


        String[] word = {"i"," " , "java"};
        String join = String.join("@",word);
        char[] Char = join.toCharArray();
        System.out.println(Arrays.toString(Char));
        String [] copy = Arrays.copyOf(word,word.length);


    }
}
