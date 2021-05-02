package day29_nestedLoop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {

        String word = "java";
        String word2 = "";
        String word3 = "";
        int count =0;
        for (int i = 0; i <word.length() ; i++) {

            for (int j = i; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                    break;
                   /* word2 +=word.charAt(j)+"";*/

                }

            }
            count++;

        }
        System.out.println(word2 );


    }
}
