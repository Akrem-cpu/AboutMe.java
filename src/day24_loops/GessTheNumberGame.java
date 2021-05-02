package day24_loops;

import java.util.Random;
import java.util.Scanner;

public class GessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int guess ;
        int rightNumber = random.nextInt(100);
        do {
            System.out.println("enter the guess number");
            guess = scan.nextInt();
            if (guess < rightNumber) {
                System.out.println(" Too small ");
            }else if (rightNumber < guess){
                System.out.println("Too big");
            }
            System.out.println("guess again ");

        }while (guess != rightNumber);

        System.out.println("you got the right number " + rightNumber);


    }
}