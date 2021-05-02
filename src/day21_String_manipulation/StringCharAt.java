package day21_String_manipulation;
import java.util.*;
public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
       String company = "Cybertek";
       char first = company.charAt(0);
        System.out.println("first = " + first);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eight  = company.charAt(7);
        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth+" "+ seventh+" "
        + eight);
        String withSpaces = first +""+second+""+third+ "" + fourth + "" + fifth + "" + sixth+""+ seventh+""
                + eight;
        System.out.println("withSpaces = " + withSpaces);


        String word1 = "aziza";
        char first1 = word1.charAt(1);


        System.out.println("first1 = " + first1);

        if (first1 == word1.charAt(word1.length()-2 )){
            System.out.println("first and last match");
        }else {
            System.out.println("first and last letter mismatch");
        }





    }
}
