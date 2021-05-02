package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        // target milk= 3.99, bread 2.55 , Cucumber 4.10 , total 10.33
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the price for the milk:   ");
        double milk = scan.nextDouble();

        System.out.print("enter the price for the bread:  ");
        double bread = scan.nextDouble();

        System.out.print("enter the price for cucumber:   ");
        double cucumber = scan.nextDouble();

        double total = milk + bread + cucumber;


        System.out.println("\n\nyou have spend $" + milk + " for milk.");
        System.out.println("you have spend $" + bread + " for bread.");
        System.out.println("you have spend $" + cucumber +" for cucumber.");
        System.out.println("you total is $" + total);
    }
}
