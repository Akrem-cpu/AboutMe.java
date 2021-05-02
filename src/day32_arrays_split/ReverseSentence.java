package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "java is fun";
        String[] wordR = word.split(" ");
        String revesr = "";

        for (int i = wordR.length - 1; i >= 0; i--) {
            System.out.print( wordR[i]+" ");
            revesr += wordR[i] + " ";

        }
        System.out.println();
        System.out.println(revesr);



    }
}
