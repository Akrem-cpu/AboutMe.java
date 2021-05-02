package day19_class_vs_object_Strings;

import java.util.Locale;

public class checkCashMatch {
    public static void main(String[] args) {
        String country = "a";
        if (country.equals(country.toUpperCase())){
            System.out.println("pass - case is correct");

        }else {
            System.out.println("fail - case is incorrect ");
        }
        String word = "Java";
        System.out.println(word.startsWith(word.toUpperCase()));
    }
}
