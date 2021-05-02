package day35_methods_with_param;

public class MethodsWithparams {
    public static void main(String[] args) {
        displayValue(6);
        displayValue(10);
        greetByName("akrem");
        printAge(26);


    }


    public static void displayValue(int num){
        System.out.println("The value is  "  + num);
    }

    public static void  greetByName(String name){
        System.out.println("hello " + name);

    }
    public static void printAge(int age){
        int year = 2021 - age;
        System.out.println("Birth year: " + year + ". Age: " + age);
    }



}
