package Loops;
import java.util.*;
public class DynamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want the alphabet upper or lower case case " );
        String letter = scan.next().toUpperCase();


        if (letter.equalsIgnoreCase("upper")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(" " + i);


            }
            System.out.println();
        }else if (letter.equalsIgnoreCase("lower")){
            for (char i = 'a'; i <= 'z'; i++) {
                System.out.print(" " + i);


            }
            System.out.println();

        }

        System.out.println("would you like them in revers?");
        String answer2 = scan.next().trim();

        if ( letter.equalsIgnoreCase("lower") && answer2.startsWith("y") || answer2.startsWith("Y") ){

            for (char i = 'z'; i >= 'a'; i--) {
                System.out.print(" " + i);


            }
            System.out.println();
        }else if( letter.equalsIgnoreCase("upper") && answer2.startsWith("n") || answer2.startsWith("N")){
            for (char i = 'Z'; i >= 'A'; i--) {
                System.out.print(" " + i);


            }
        }






    }
}
