package Loops;

public class ReversOnlySecondWord {
    public static void main(String[] args) {

        String word = "i love java";
        int wordIndexOFSpace = word.indexOf(" ");
        System.out.print(word.substring(0  ,wordIndexOFSpace+1) );
             for ( int i =word.lastIndexOf(" ")-1  ; i > wordIndexOFSpace ; i--){

                 System.out.print(word.charAt(i));

             }
        System.out.print(word.substring(word.lastIndexOf(" ") ));



    }

 }



