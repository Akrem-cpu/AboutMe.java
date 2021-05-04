package saim_only;

import java.util.ArrayList;
import java.util.*;

public class FourOrLess {
    public static void main(String[] args) {
        int numbers;
        String words;

        Scanner scan = new Scanner(System.in);
        List<String> str = new ArrayList<String>();
        System.out.println("how many words you wold like to input");
        numbers = scan.nextInt();

        for (int i = 0; i < numbers ; i++) {
            System.out.println(i + " input your word");
            str.add(words = scan.next());
        }

        List<String> strCopy = new ArrayList<String>();

        for (String each : str ) {
            if (each.length() <= 4){
                strCopy.add(each);
            }

        }

        System.out.println(strCopy);




    }
}
