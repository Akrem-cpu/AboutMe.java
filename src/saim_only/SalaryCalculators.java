package saim_only;
import java.util.Scanner;
public class SalaryCalculators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your desire salary yearly:");
        int salary = scan.nextInt();
        scan.nextLine();
        System.out.println("please enter your desire working time: Full Time / Part Time ");
        String workingTime = scan.nextLine();

        if (workingTime.equals("Full Time")){
                salary += 2000;
        }else  if ( workingTime.equals("Part Time")){
             salary -= 5000;
        }

        System.out.println("since you are a " + workingTime + " worker, then you salary is " + salary);




    }

}
