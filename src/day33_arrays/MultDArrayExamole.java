package day33_arrays;
import java.util.*;

public class MultDArrayExamole {
    public static void main(String[] args) {
        /**
         0    1
         0    "Teodora Tsvetanov"    "TeodorasPWD12"
         1    "Anna Ziyayeva"    "AnnaAlmaty123"
         2    "Parvin Altae"    "ParvinVienna321"
         */
        String [][] user = new String[3][2];
        user[0][0] = "Teodora Tsvetanov";
        user[0][1]= "TeodorasPWD12";
        user[1][0]= "Anna Ziyayeva";
        user[1][1]= "AnnaAlmaty123";
        user[2][0]=  "Parvin Altae" ;
        user[2][1]= "ParvinVienna321";

        System.out.println(user[0][0]);
        System.out.println(user[1][0]);
        System.out.println(user[2][0]);

        System.out.println(user[0][1]);
        System.out.println(user[1][1]);
        System.out.println(user[2][1]);

        System.out.println(Arrays.deepToString(user));
    }
}
