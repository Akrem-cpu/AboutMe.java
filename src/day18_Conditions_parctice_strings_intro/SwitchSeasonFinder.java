package day18_Conditions_parctice_strings_intro;

import java.util.Scanner;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // winter 12,1,2  spring = 2,3,4, fall = 6,7,8  fall = 9,10,11

        System.out.println("please enter the month in number");
        int month = scan.nextInt();

        if(month >0 && month<=12){
            switch (month){
                case 1: case 12: case 2:
                    System.out.println("winter");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Spring");
                    break;
                case 6: case 7: case 8:
                    System.out.println("Summer");
                    break;
                case 9: case 10 : case 11:
                    System.out.println("Fall");
                    break;

            }
        }else {
            System.out.println("invalid month");
        }


    }
}
