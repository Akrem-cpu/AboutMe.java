package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("pls enter your current speed:");
        int currentSpeed = scan.nextInt();

        int speedLimits = 55, overLimits = currentSpeed - speedLimits;
        System.out.println("you are deriving over the speed limits. you are " + overLimits +"MPH over the limit.");

    }
}
