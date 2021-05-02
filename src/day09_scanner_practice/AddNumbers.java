package day09_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("choose a number?");
        double num1 = scan.nextDouble();
        System.out.println("what is your favorite number?");
        double num2 = scan.nextDouble();
        double totalNum = num1 + num2 ;
        System.out.println("your answer gonna be added " +totalNum+ " this is my new lucky number");

    }
}
