package day39_wrapper_classes;

import java.util.Arrays;

public class ParseString {
    public static void main(String[] args) {
        String  word = "123";
        int value = Integer.parseInt(word);
        System.out.println(value+1);


        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if (price > 100){
            System.out.println("expensive");
        }
        String sentence = "I worte 857 lines of code";
        String[] sentenceSplit = sentence.split(" ");
        double price2 = Double.parseDouble(sentenceSplit[2]);
        System.out.println(price2);



    }
}
