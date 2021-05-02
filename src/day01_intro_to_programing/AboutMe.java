package day01_intro_to_programing;
import java.util.*;
public class AboutMe {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, my name is Akrem, i live in chicago.");



        int num = 9;
        System.out.println("num = " + num);
        if ( num++ == 10 ) {
            System.out.println("hello world " + num);
        }else {
            System.out.println("hello universe " + num);
        }
        System.out.println("num = " + num);


        System.out.println(365 * 24 * 3600 * 1024 * 1024 * 1024);




        System.out.println("tell me about you self?");
        String answer = scan.next();
        System.out.println("tell me more about you");
        String answer2 = scan.nextLine();


        System.out.println(answer + answer2);

        // ' = \' , " = \"


    }
}
