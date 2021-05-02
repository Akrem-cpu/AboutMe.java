package MyOwn;
import java.util.Scanner;
public class Mytution {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("input your money Akrem:");
        int balance = scan.nextInt();

        System.out.println("plase enter how many month you have left to complete the course.");
        int monthLeftToPass = scan.nextInt();

        int expInMonth = 750 + 500   ;
        int monthWithOutJob = balance /expInMonth;
        int dayWithOutAJob = balance % expInMonth ;

        int toMakeIt = expInMonth * monthLeftToPass;
        boolean success = monthWithOutJob >= monthLeftToPass;


        System.out.println("this is how long  you will stay alive:");
        System.out.println(monthWithOutJob + " month and " + dayWithOutAJob + " days");
        if (monthWithOutJob >= toMakeIt ) {
            System.out.println(" akrem you son if tomato you gonna make it.");
        }else{
            System.out.println("you need to make money dude. look for a source of money.");
            int moneyNeedToFinishTheCourse = monthLeftToPass * expInMonth - balance;
            System.out.println("you need at list " + moneyNeedToFinishTheCourse +"$ to finish this course.");
            double needToMakeMoneyEachMonth = toMakeIt /monthLeftToPass;
            System.out.println("you need to make $" + needToMakeMoneyEachMonth + " each month. it is not a " +
                    "lot you can make it ");
            }
        }


    }

