package study_while_murdil_is_gone;

public class customMethodUtils {
    public static double sum(double a, int b) {
        double answer = a + b;
        return answer;

    }

    public static double multiple(int a, int b) {
        int answer = a * b;
        return answer;
    }

    public static void CheckIfEmptyOrNull(String word) {
         if (word ==  null || word.isEmpty() ){
             System.out.println("true");
         }else {
             System.out.println("the string is not empty");
         }
    }
}