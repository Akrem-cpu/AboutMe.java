package day24_loops;
import java.util.*;
public class pinCodeDOWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your code?");
        int code = scan.nextInt();
        int times = 1;
       if (code != 1234) {
           do {
               System.out.println("code incorrect please enter the correct code?");
               code = scan.nextInt();
               times++;
           } while (times <= 5 );
           System.out.println("you have tried more then five time. your phone has been locked \uD83D\uDD0F");
       }else if (code == 1234) {
           System.out.println("welcome to your iphone");
       }








    }
}
