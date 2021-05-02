package day14_Multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 2 number that you want to calculate:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("please enter the operator you want to use: -,+,*,/,%");
        char operator = scan.next().charAt(0);

        if (operator == '-') {
            System.out.println(num1 + num2);
        } else if (operator == '+') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("invalid input.");
        }

    }
}
