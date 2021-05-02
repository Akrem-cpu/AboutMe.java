package MyOwn;

import java.util.Arrays;
import java.util.Scanner;

public class check3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        String[] infos =info.split(",");
        System.out.println("person name: " + infos[0]);
        System.out.println("last name: " + infos[1]);
        System.out.println("age: " + infos[2]);



    }
}
