package saim_only;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your first name:");
        String firstName = scan.next();
        System.out.println("please enter you last name:");
        String lastName = scan.next();
        // scan.nextLine();
        System.out.println("please enter your age:");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("dear " + firstName + " " + lastName + ", since you are " + age + " " +
                    ",years old, you are eligible to vote.");
        } else {
            System.out.println("dear " + firstName + " " + lastName + ", since you are " + age + " " +
                    ",unfortunate you are not eligible to vote.");
        }


    }
}
