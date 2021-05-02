package Loops;
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumber = 0;
        int minNumber = 2147483647;
        for (int i = 1 ; i <=5 ; i++  ){
            System.out.println("please enter your " + i + " number");
            int number  = scan.nextInt();

            if (number > maxNumber) {
                maxNumber = number;


            }
            if (number < minNumber ){
                minNumber = number;
            }

        }



        System.out.println("the max number is " + maxNumber);
        System.out.println("minNumber = " + minNumber);



    }
}
