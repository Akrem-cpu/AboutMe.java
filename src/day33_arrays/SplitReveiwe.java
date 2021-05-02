package day33_arrays;

import java.util.Arrays;

public class SplitReveiwe {
    public static void main(String[] args) {
        String word = "ajava";
        String[] array = word.split("a");
        System.out.println(array);
        String word2 = "java1sql2html";
        String[] strArr = word2.split("\\d");
        System.out.println(Arrays.toString(strArr));
        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " + word2);


        String password = "bcd123_5";
        if (password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }
}
