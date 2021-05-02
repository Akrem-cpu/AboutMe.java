package MyOwn;
import java.util.Scanner;
public class VariableFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        String word = "Today's word of the day is: " + answer;
        System.out.println(word);

    }
}
