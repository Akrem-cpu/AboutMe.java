package day14_Multi_branch_if_statements;

import sun.swing.DefaultLayoutStyle;

import java.util.Scanner;

public class DayActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please tell me how the weather is? ");
        String weather = scan.next();

        if (weather.equals("sunny")) {
            System.out.println(weather + " go to the park, hiking, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather +" stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather +" clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println(weather+ " ger ready for power loss, fly a kite, and ");
        }


    }

}
