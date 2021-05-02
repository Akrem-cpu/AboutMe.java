package Loops;

import javafx.scene.paint.Stop;

public class Olaindrome {
    public static void main(String[] args) {
        //
        String word = "Civic";
        String wordR = "";
        for (int i = word.length() -1 ; i >= 0 ; i--) {
            wordR += word.charAt(i);

        }
        if (word.equalsIgnoreCase(wordR)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }
}
