package day33_arrays;
import java.util.*;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] num = {1, 2,5, 3, 4};
        System.out.println(Arrays.toString(num));


        for (int i = 0; i < num.length/2 ; i++) {
              int temp = num[i];
              num[i] = num[num.length -1-i] ;
              num[num.length-1-i] = temp;


        }
        System.out.println(Arrays.toString(num));

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before = " + Arrays.toString(words));
        for (int i = 0 ; i < words.length/2 ; i++){
            String temp = words[i];
            words[i] =words[words.length - 1-i];
            words[words.length - 1-i] = temp;

        }
        System.out.println("before = " + Arrays.toString(words));

        for (int i = 0 , j = words.length-1 ; i < words.length/2 ; i ++ , j-- ){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;

        }
        System.out.println("After = " + Arrays.toString(words));
        int[] a = new int[3];
        System.out.println(a[1]);


    }
}
