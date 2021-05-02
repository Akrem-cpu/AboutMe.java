package day24_loops;
import java.util.Scanner;
public class coutnUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until");
        int numberToStop = scan.nextInt();
        int start = 1;
        while (numberToStop >= start ){
            System.err.print(start +" " );
            start++;
        }






    }
}
