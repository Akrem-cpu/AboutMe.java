package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';


        while (letter <= 'z'){
            System.out.print( letter++ + " ");

         }
        System.out.println("\uD83E\uDD70");
        letter = 'z';

        while (letter >= 'a'){
            System.out.print(letter-- + " ");
        }

    }
}
