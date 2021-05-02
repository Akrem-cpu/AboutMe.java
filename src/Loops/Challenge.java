package Loops;

import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        Random r = new Random();
        String source = "0123456789abcdefghijklmnopABCDEFGHIGKLMPO*&^%$#@!";
        String randomPasscode = "";
        int sourceLength = source.length()-1;

        for (int i = 0; i < 6; i++) {
         /*   System.out.print(source.charAt(r.nextInt(sourceLength)));*/
            if (source.charAt(i) != source.charAt(r.nextInt(sourceLength))){
             randomPasscode += source.charAt(r.nextInt(sourceLength));
            }

        }
        System.out.println("your passcode is = " + randomPasscode  );



    }
}
