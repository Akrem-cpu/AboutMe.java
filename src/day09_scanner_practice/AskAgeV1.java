package day09_scanner_practice;
import java.util.Scanner;
public class AskAgeV1 {
    public static void main(String[] args ){
        Scanner askAge = new Scanner (System.in);
        System.out.println("how old are you? ");
        int age = askAge.nextInt();
        System.out.println( age + " that is my age" );

    }
}
