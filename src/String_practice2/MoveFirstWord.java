package String_practice2;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentences = "c++ is a fun language";
        int firstSpaceInx = sentences.indexOf(" ");


        System.out.println(sentences.substring(firstSpaceInx  ) + " "+ sentences.substring(0 , firstSpaceInx ) );


    }
}
