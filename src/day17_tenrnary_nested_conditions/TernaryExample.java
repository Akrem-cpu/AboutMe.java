package day17_tenrnary_nested_conditions;

public class TernaryExample {
    public static void main(String[] args) {
        int score1 = 75;
        String result = (score1 > 60 ) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality = "good";
        System.out.println(quality.equals("good") ? 100 : 0);
        int Rating = quality.equals("good") ? 100 : 0;
        System.out.println("Rating = " + Rating);

        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        String todaysClass = "java";

        String teacher = (todaysClass.equals("java")) ? "Murdil" : "akrem";





    }
}
