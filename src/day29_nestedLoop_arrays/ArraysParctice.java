package day29_nestedLoop_arrays;

import java.util.Scanner;

public class ArraysParctice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counters = {1,2,3,4,5};
        double[] prices = {45.6,6.6,775,55.5,};
        String[] cities = {"chicago " , "New york", "baltimore" , "casablanca ", "tashkent"};


        int input = scan.nextInt();
        int password = 123;
        for (; password != input ; ) {
             input = scan.nextInt();
            System.out.println("wrong pass code ");
            input = scan.nextInt();
        }
        System.out.println("welcome ");


    }
}
