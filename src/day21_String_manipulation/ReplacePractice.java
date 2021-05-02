package day21_String_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String wor = "getHub";
        System.out.println(wor.toUpperCase());
        System.out.println(wor.replace("Hub", "lap"));
        System.out.println("wor = " + wor);
        wor = wor.replace("Hub","Lap");
        System.out.println(wor);
        wor = wor.replace("g","i").replace("a","i");
        System.out.println("wor = " + wor);

        String sentance = " java is fun";
        String withNoSpace = sentance.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);
        // java = "selenium        fun  = a lot of fun

        withNoSpace = sentance.replace("java", "selenium").replace("fun","a lot of fun").replace(" ","");
        System.out.println("withNoSpace = " + withNoSpace);
        withNoSpace = sentance.replace("a","f");
        System.out.println("withNoSpace = " + withNoSpace);


        String result = "1-48 pf over 565 result for \"java\"";
        result = result.replace("1-48 pf over ", ""). replace("result for \"java\"", "");
        System.out.println("result = " + result);

    }
}
