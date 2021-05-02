package day22_String_manipulations;

import com.sun.media.sound.RIFFWriter;

import java.lang.*;
import java.util.Locale;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        word = word.toLowerCase();
        String word2 = ""+ word.charAt(3) +word.charAt(2)  + word.charAt(1) + word.charAt(0);



        if (word.equalsIgnoreCase(word2)) {
            System.out.println("yes");
        }else {
            System.out.println("go to hell");
        }

    }
}
