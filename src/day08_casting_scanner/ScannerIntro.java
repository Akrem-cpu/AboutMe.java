package day08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is you name?");
        String firstName = scan.nextLine();
        System.out.println("nice to me you," + firstName);
    }
}
