package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price.");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25){
            System.out.println("free shipping Eligible. your order total: $" + totalPrice);

        } else {
            System.out.println("free shipping is not Eligible. you order is: $" + totalPrice + "which is less then 25$" );
        }

    }
}
