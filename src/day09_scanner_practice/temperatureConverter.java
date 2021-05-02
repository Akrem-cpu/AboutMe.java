package day09_scanner_practice;
import  java.util.Scanner;
public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("*******temp converter*******");
        System.out.println("enter you temperature in fahrenheit: ");
        double fehrenheit =  scan.nextDouble();
         double celsius = (fehrenheit -32) * 5/9;
        System.out.println("celsius = " + celsius);
    }
}
