package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] Char = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char each :Char) {
            System.out.print(each);

        }

        String sentence = new String(Char);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
       char[] itemArray = item.toCharArray();
        System.out.println(itemArray.length);

        String[] fruits  = {"bananas" ,  "apples" , "kiwi" , "mango" , "papaya" , "strawberry"};
        String strFruits = "";
        for (String each: fruits) {
            strFruits+= each+"-";

        }
        System.out.println("strFruits = " + strFruits);

        String[] languages = {"java", "python" , "C++" , "sql" , "ruby" , "javascript"};
        System.out.println(String.join("##", languages));



    }
}
