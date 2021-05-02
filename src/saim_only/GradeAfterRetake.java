package saim_only;
import java.util.Scanner;

public class GradeAfterRetake {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your score");
        int score = scan.nextInt();
        System.out.println("write your number of attempt");
        int attempt = scan.nextInt();

        switch (attempt){
            case 1:
                score = score - (score * 10 / 100 ) ;
             break;
            case 2:
                score = score - (score * 20 / 100 ) ;
                break;
            case 3 :
                score = score - (score * 35 / 100 ) ;

        }

        System.out.println( " since you tried " + attempt +" your score = " + score );


    }
}
