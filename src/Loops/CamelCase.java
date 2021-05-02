package Loops;

public class CamelCase {
    public static void main(String[] args) {
        String word =" thisHasManyWordsToFind";
        int count = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) < 'Z' && word.charAt(i) > 'A')
            count++;
        }

        System.out.println("there are " + (count+1) + " words in this camel case");


    }
}
