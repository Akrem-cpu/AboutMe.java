package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'i';
        int index = -1;
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == letter ){
               index = i;
                System.out.println("index for  " + word.charAt(index) + " is found, it is  " + index);
               break;// in this condition it like exits the loop.
            }

        }
        if (index == -1){
            System.out.println("letter not present ");
        }



    }
}
