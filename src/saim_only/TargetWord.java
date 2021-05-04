package saim_only;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetWord {
    public static void main(String[] args) {
        String word = " why i like java is fun cus java make you thing a lot but python i dont like java ";
        List<String> str = new ArrayList<String>(Arrays.asList(word.split(" ")));
      int i =0;
        for (String each : str) {
            if (each.equals("java")){
                i++;
            }
        }
        System.out.println("java it being mention " + i + " times");
        // container that contain multi data.
        String[] names = new String[3];
        names[0]= "inaam";
        System.out.println(names[0] + names[1]);
        //Arrays class. to char array
        char a [] = word.toCharArray();
        System.out.println(Arrays.toString(a));
        // sort method
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // char to string
        String charToString = new String(a);
        System.out.println(charToString);
        // copy of
        char[] copy =  Arrays.copyOf(a,a.length);
        //
        String[] count = word.split("java");
        if (word.endsWith("java")) {
            System.out.println(count.length);
        }else {
            System.out.println(count.length-1);
        }
        System.out.println(Arrays.toString(count));

        // --------------
        //java ------------------
        //java -----------------------
        /// [ "one","two" , "move"]
        ///    eno   owt      evom

    }

}
