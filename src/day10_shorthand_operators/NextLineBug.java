package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your rent and month:");
        double rent = scan.nextDouble();
        scan.nextLine();// work around.
        String date = scan.nextLine();
        System.out.println("date = " + rent);
        System.out.println("rent = " + date);


    }
}
