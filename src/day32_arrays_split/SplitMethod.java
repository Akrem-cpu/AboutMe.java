package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordArray = words.split(",");
        System.out.println(Arrays.toString(wordArray));
        System.out.println(wordArray.length);
        for (String each : wordArray) {
            System.out.println(each);

        }

        String sentence = "today I am coding java arrays";
        String[] sentenceArrays = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArrays));
        System.out.println("length = "+sentenceArrays.length);
        for (String each : sentenceArrays) {
            System.out.println(each);

        }



    }
}
