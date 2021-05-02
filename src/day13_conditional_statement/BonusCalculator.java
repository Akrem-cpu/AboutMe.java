package day13_conditional_statement;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your sale");
        double salesAmount = scan.nextDouble();
        double bonus = 10;

        if (salesAmount >= 2000.55) {
            System.out.println("Good job, you are qualified for bons!");
            bonus = 200;
        } else {
            System.out.println("Good job, you are qualified for bons!");
            bonus = 50;

        }

        System.out.println("you bonus is $" + bonus);
    }
}
