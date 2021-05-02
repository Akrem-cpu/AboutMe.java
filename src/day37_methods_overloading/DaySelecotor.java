package day37_methods_overloading;
import static day38_methods.StringUtils.*;

public class DaySelecotor {
    public static void main(String[] args) {
       // System.out.println(getDayName(100));
        for (int i = 1; i < 8 ; i++) {
            System.out.println(getDayName(i));
            System.out.println(isPalindrome("akrem"));


        }

    }


    public static String getDayName(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("error");
                break;
        }




        return "";
    }






}
