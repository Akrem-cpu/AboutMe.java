package day13_conditional_statement;

import java.util.Scanner;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("tell me if you are hungry or not. please say true or false only.");
        boolean isHunger = scan.nextBoolean();

        if (isHunger) {
            System.out.println(" let me buy you a meal");

        } else {
            System.out.println("you missing out. i was buying.");
        }

        double price = 130.44;
        boolean isAffordable = price >= 200;

        if (!isAffordable) {

            System.out.println("i can afford it lets buy it.");

        } else {
            System.out.println("i cant afford it.");
        }

        boolean isRemoteJob = true;


        if (!isRemoteJob){
            System.out.println("sorry i am not interested");
        }else {

            System.out.println("Sure i am interested, what is the interview process");
        }

    }
}
