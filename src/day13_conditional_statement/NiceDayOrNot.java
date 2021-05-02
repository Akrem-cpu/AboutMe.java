package day13_conditional_statement;

import java.util.Scanner;

public class NiceDayOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please Enter Temperature ");
        double temp = scan.nextDouble();

        if (temp >= 70) {
            System.out.println("it is good day to code java ");
        } else {
            System.out.println("it is a bad day. bette to go to bed lol");
        }


    }
}
