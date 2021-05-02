package day12_conditional_statements;
import java.util.Scanner;
public class ComparisonExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
       // System.out.println("Enter your speed");
       // int currentSpeed = scan.nextInt();


              //  int speedLimit = 45;
      //  boolean isSpeeding = false;
       // System.out.print(isSpeeding != currentSpeed> speedLimit );
        System.out.println("enter your balance:");
        double balance = 250.25;
        double itemPrice = 200.99;
        boolean canIAffordIt = balance>itemPrice;
        System.out.println("can i afford? " + canIAffordIt);
        balance -= itemPrice;
        boolean iAmBroke = balance <= 60;
        System.out.println("Am i Broke  after that= " + iAmBroke);



    }
}
