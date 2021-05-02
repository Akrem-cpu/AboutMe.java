package day32_arrays_split;

import java.util.Arrays;

public class countUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here cat";
                   //    0      1        1
        String[] cats1 = cats.split("cat");
        System.out.println("number of cat = " + (cats1.length -1));
        if (cats.endsWith("cat")){
            System.out.println(cats1.length - 1 + 1);
        }

    }
}
