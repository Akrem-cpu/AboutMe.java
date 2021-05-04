package saim_only;

import java.util.Arrays;

public class HideenPassword {
    public static void main(String[] args) {

        String[] words = {"One" , "hi" , "hold"};
        String[] hidden = new String[words.length];
        int j =0;

        for (String each : words) {
            String temp ="";
            for (int i = 0; i < each.length(); i++) {
                temp += "*";
            }
            hidden[j] = temp;
            j++;
        }

        System.out.println(Arrays.toString(hidden));


    }
}
