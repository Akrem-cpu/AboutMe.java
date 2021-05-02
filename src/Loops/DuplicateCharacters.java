package Loops;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "AAABCCDEEFFFFSSSR";
        String duplicate = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    count++;

                }

                if (count >=2 ){
                    if (!duplicate.contains(word.charAt(i)+""))
                    duplicate += word.charAt(i);

                }

            }



        }


        System.out.println(duplicate);

    }
}
