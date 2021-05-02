package study_while_murdil_is_gone;
import java.util.*;

public class ArraysClasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // method Array char to Strings
        char [] Char = {'J', 'a', 'v' , 'a', ' ', 'i' , 's', ' ' , 'f', 'u' ,'n'  };
        String CharConvertedToSentence = new String(Char);
        System.out.println(CharConvertedToSentence );
        System.out.println(Char[0] + Char[1] );
        // what ever we can do with for loop we can do with while loop and do while loop
/*
        String passCode = scan.next();
        for (int i = 0; !passCode.equals("1234") ; i++) {
            System.out.println("wrong passcode please enter you passcode");
            passCode = scan.next();
        }
*/



        // method Arrays Strings to char
        String word = "python is fun ";
        char[] wordToChar = word.toCharArray();
        System.out.println(wordToChar);


        // Arrays method sort          data type int [] variable a  = new int[3]     Arrays.toString(a)
        int [] nums = {15,1, 27,29};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];// 15
            nums[i] = nums[nums.length-1-i];// change 15 to 29
            nums[nums.length-1-i] = temp; // 29 change to  15
        }
        System.out.println(Arrays.toString(nums));


        // binary search always come with sort. unless you sort it it is hard to find the reliable binary
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums, 27));
        int indexOf27 = Arrays.binarySearch(nums, 4);
        System.out.println(indexOf27);

        // Arrays method join  by default empty Sting is nulls /  by default empty int 0/ by default empty boolean false;

        String[] word1  = {"java" , "C++" , "python" ,"maven" };
        String word1join= String.join("/", word1);
/*        for (String each: word1) {
            word1join += each+"/";
        }
        System.out.println(word1join.substring(0,word1join.length()-1));*/
        System.out.println(word1join);

        // Arrays copyOf
        String [] copyOfWord1= Arrays.copyOf(word1 ,word1.length);
    /*    int i =0;
        for (String each : word1) {
            copyOfWord1[i] = each;
            i++;

        }*/
        System.out.println(Arrays.toString(copyOfWord1));

        String word3 ="java is fun";
        String[] split = word3.split(" ");
        System.out.println(Arrays.toString(split));
        char[] word3InChar = word3.toCharArray();
        System.out.println(Arrays.toString(word3InChar));



    }
}
