package day20_String_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital | one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains("|")){
            System.out.println("multiple world ");
        }else{
            System.out.println("single word company name.");
        }

        String firstName = "akrem";
        if (firstName.contains("a")&& firstName.contains("e")){
            System.out.println("this name contain a and e letter.");
        }else{
            System.out.println("this name does not contains e or a letter");
        }

        String emil = "Akrem@gmail.com";
        if (emil.toUpperCase().contains("A") && emil.contains("@")){
            System.out.println("correct emil");
        }else {
            System.out.println("incorrect ");
        }








    }
}
