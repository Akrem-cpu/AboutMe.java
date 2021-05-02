package saim_only;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please Enter a number:");
        int number = scan.nextInt();


        int a = number % 2;
        int b = number % 3;
        int c = number % 5;
        boolean a1 = a == 0;
        boolean b1 = b == 0;
        boolean c1 = c == 0;

        if (a1) {
            System.out.println(number + " is divisible by 2: " + a1);
        } else {
            System.out.println(number + " is divisible by 2: " + a1);
        }
        if (b1) {
            System.out.println(number + " is divisible by 3: " + b1);
        } else {
            System.out.println(number + " is divisible by 3: " + b1);
        }
        if (c1) {
            System.out.println(number + " is divisible by 5: " + c1);
        } else {
            System.out.println(number + " is divisible by 5: " + c1);
        }
    }
}
