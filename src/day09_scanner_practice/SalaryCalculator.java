package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate?");
        double hourlyPay = scan.nextDouble();
        double WeekPay = hourlyPay * 40, monthPay = WeekPay * 52/12, annualPay = monthPay *12;
        System.out.println("what is your average hours per week?");
        double hours = scan.nextDouble();
        System.out.println("guess how much you gonna make by the end of this course?");
        double yourGuess = scan.nextDouble();
        System.out.println("your Guess = " + yourGuess );
        System.out.println("******* real payment********");
        System.out.println("WeekPay = " + WeekPay);
        System.out.println("monthPay = " + monthPay);
        System.out.println("annualPay = " + annualPay);







    }
}
