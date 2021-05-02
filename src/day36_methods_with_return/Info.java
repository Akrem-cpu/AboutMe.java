package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println(FullName() +"what"+"Name: "+"  married status: " + isMarried() +" age: " + getAge());

        System.out.println(getRandomRear());
        System.out.println(getRandomRear());


    }


    public static String  FullName(){

        System.out.print("akrem jemal ");
        return "Akrem jemal";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 21;
    }
    public static int getRandomRear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }




}
