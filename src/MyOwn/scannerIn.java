package MyOwn;

import java.util.Scanner;

public class scannerIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();


        System.out.println("Today\'s word is: java");
        double age = scan.nextDouble();

        System.out.println("what is your senior quote?");
        String quote = scan.nextLine();
        quote = quote + scan.nextLine();

        System.out.println("thank you " + name + " your age is " + age + " and your favorite quote is " + quote);


    }
}
