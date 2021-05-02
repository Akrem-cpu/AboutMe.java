package String_practice2;

import java.util.Locale;

public class Initials {
    public static void main(String[] args) {
        String name = "nabil abdu";
        name = name.toUpperCase();

        System.out.println(name.substring(0,1) + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2) );


    }
}
