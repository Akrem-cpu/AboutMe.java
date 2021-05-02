package saim_only;
import java.util.Scanner;
public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the 3 side angles: ");
        double angle1 = scan.nextDouble();
        double angle2 = scan.nextDouble();
        double angle3 = scan.nextDouble();
        double angleSum = angle1 + angle2 + angle3;
        if (angleSum == 180) {
            System.out.println("valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }

    }
}
