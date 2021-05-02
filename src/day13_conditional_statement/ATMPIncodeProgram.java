package day13_conditional_statement;
import java.util.Scanner;
public class ATMPIncodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("***** WELCOME TO TD BANK ATM****");
        int secretPinCode = scan.nextInt();
        int inputPiCode = 1234;

        if (secretPinCode == inputPiCode){
            System.out.println("welcome to your account");
            System.out.println("please click on one of  the options");

        } else {
            System.out.println("Your pin code is incorrect");
        }
    }
}
