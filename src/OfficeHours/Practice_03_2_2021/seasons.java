package practice_03_2_2021;
import java.util.Scanner;
public class seasons {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seasons number?:\n1-spring\n2-summer\n3-fall\n4-winter");
        int seasons = scan.nextInt();
        int day = 10 , night = 10;
        String seasonName = "";



        if (seasons == 1){
            day = 14;
            night = 10;
            seasonName = "Spring";
        }
        if (seasons == 2){
            day = 16;
            night = 8;
            seasonName = "Summer";

        }
        if (seasons == 3){
            day = 14;
            night = 8;
            seasonName = "Fall";
        }
        if (seasons == 4){
            day = 4;
            night = 12;
            seasonName = "Winter";
        }


        System.out.println("In " + seasonName + " there is " + day + " hours of day light " + night + " hours of night time");







    }
}
