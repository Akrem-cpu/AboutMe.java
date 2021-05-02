package day33_arrays;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String  sentence = "java is fun";
        String[] wordsArrays  = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArrays));
        System.out.println(wordsArrays.length);

        int count = 0;
        int count1 = 1;
        for ( String each : wordsArrays ){
            System.out.println( count1 +"st word = " + wordsArrays[count]);
            count1++;
            count++;
        }


        String GoogleResult =  "About 1,810,000 results (0.68 seconds)";
        String[] word = GoogleResult.split(" ");
        System.out.println( "count = "+word[1]);
        System.out.println("seconds = " + word[3].substring(1));

    }
}
