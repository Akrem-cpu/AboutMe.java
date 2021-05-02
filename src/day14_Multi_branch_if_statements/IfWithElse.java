package day14_Multi_branch_if_statements;
import java.util.Scanner;
public class IfWithElse {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("pls enter the year:");
        int year = scan.nextInt();

        if (year == 2020){
            System.out.println("covid19 pandemic year " + "\n wear mask and keep distance");
        }

        String country = "USA";
        if (country.equals("USA")){
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania ava");
        }
        System.out.println("Welcome to " + country);

    }
}
