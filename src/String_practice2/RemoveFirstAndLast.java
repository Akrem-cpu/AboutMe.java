package String_practice2;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        String  word1 = "apple";
        String word2 = "akrem";
        System.out.println(word1.substring(1));
        int count  = word2.length() - 1;
        System.out.println(word2.substring(0,count) );


    }
}
