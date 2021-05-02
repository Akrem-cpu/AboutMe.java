package day36_methods_with_return;
import java.util.*;
public class CreditScore {
    public static void main(String[] args) {
        checkEligible(0);
        int credit = getCreditScore(800);
        System.out.println(credit);

    }



    public static void checkEligible(int num){
        if (num >= 700){
            System.out.println("You are eligible for leasing this car");
        }else {
            System.out.println("sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore(int num){
        return num;
    }






}
