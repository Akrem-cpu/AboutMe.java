package day09_scanner_practice;
import java.util.Scanner;
public class centsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your cents to be change to dollars:");
        int cent = scan.nextInt();
        int dollar = cent / 100;
        double remainingCent = cent % 100;

        System.out.println("you have $" + dollar + " dollar and " + remainingCent+ " cent." );

    }
}
