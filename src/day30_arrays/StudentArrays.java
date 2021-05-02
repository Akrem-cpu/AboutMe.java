package day30_arrays;

import java.util.Arrays;
import java.util.Locale;

public class StudentArrays {
    public static void main(String[] args) {
        String[] student1 = new String[5];

        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        System.out.println("student ID\t=         " + student1[0]);
        System.out.println("student First name\t= " + student1[1]);
        System.out.println("student Last name\t= " + student1[2]);
        System.out.println("student Batch Number\t= " + student1[3]);
        System.out.println("student Phone number\t= " + student1[4]);
        String[] student2 = {"MK4421" , "Mike", "Bloomberg", "B22" , "703-432-1234","wer"};


        if (student1.length == 5) {
            System.out.println("Pass: data array has a correct length ");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }
       if (student1.length == student2.length){
           System.out.println("Pass: data array has a correct length ");
       } else {
           System.out.println("Fail: data array has incorrect length");
       }

        System.out.println((student1[1]+ " " + student1[2]).toUpperCase());
        String a = "java is fun";
        String[] as = a.split(" ");
        System.out.println(Arrays.toString(as));







    }
}
