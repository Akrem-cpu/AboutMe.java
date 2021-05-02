package saim_only;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the year you want to check: ");
        int year = scan.nextInt();
        int leapYear = year %  4;
        String checkLeapYear = (leapYear == 0 ) ? "Leap year" : "not a leap year";
        System.out.println("checkLeapYear = " + checkLeapYear);


    }
}
