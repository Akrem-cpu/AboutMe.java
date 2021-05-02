package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        Random R = new Random();
        String source = "ABCDEFGHIJKLMNOPQRSTUWXYZabcdefghigklmopnz0123456789_*&^%$#@!";
        String password = "";
        for (int i = 0; i <=5; i++) {
            int index = R.nextInt(60);
            System.out.print(source.charAt(index));
           password += source.charAt(index);

        }
        System.out.println();
        System.out.println("Your password " + password);




    }
}
