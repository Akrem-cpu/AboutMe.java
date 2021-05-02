package day15_logicaLops_switch_ternary;
import java.util.Scanner;
public class JobOffereChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the location you are comfortable to work in:");
        String location =scan.next();
        System.out.println("please enter you desire salary ");
        int salary = scan.nextInt();
        boolean isRemote = true;
        boolean benefits = true;

        if (isRemote && benefits && salary >=5500 && location.equals("chicago")){
            System.out.println("I accept this job");
        }else {
            System.out.println("i dont expect this offer.");
        }
    }
}
