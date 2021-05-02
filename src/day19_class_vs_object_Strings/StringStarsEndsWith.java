package day19_class_vs_object_Strings;

public class StringStarsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";

        System.out.println(word.startsWith("intellij idea"));

        System.out.println(word.endsWith("a"));


        String firstName = " Dr. nadir";
        if (firstName.startsWith("dr. ")){
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mr. ")){
            System.out.println("Man");
        }else if (firstName.startsWith("Mrs. ")){
            System.out.println("married");
        }else if (firstName.startsWith("Sr. ")){
            System.out.println("senior");
        }


    }
}
