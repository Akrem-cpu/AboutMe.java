package day18_Conditions_parctice_strings_intro;

public class ScaoreRangeTest {
    public static void main(String[] args) {
        int score = 91;

        if (score <= 1 && score <= 40 ){
            System.out.println("score = D ");
        }else if (score > 40 && score <= 60){
            System.out.println("score = C " );
        }else if (score > 60 && score <= 90){
            System.out.println("score = B ");
        }else if (score > 90 && score <= 100 ){
            System.out.println("score = A " );
        }else {
            System.out.println("Invalid input ");
        }

    }
}
