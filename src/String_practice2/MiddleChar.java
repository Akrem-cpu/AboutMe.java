package String_practice2;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "elephanta";
        int count = word.length();

        if (word.length() % 2 == 0 ){
            System.out.println(word.substring(count / 2 -1 , count / 2 + 1 ));
        }else if (count % 2 >= 1 ){
            System.out.println(word.substring(count / 2, count / 2 + 1));
        }



    }

}
