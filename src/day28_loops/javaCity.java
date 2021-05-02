package day28_loops;

import java.time.LocalDate;

public class javaCity {
    public static void main(String[] args) {
        int totalCases = 0;
        int day= 0;
        for (int i = 1; i <= 30; i++) {
             if (i % 7 == 0){
                 totalCases += 500;
                 System.out.println("we have " + totalCases + " today." + " today date is " + i);
             } else {
                 totalCases += 200;
                 System.out.println("we have " + totalCases +  " today." + " today date is " + i );
             }

        }

    }
}
