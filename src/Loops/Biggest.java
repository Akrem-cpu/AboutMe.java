package Loops;

public class Biggest {
    public static void main(String[] args) {
        String word = "aaabbbcccccddddee";
        String longestSubstring= "";
        String temp = "";

        for (int i = 0; i < word.length()-1; i++) {
            temp+= word.charAt(i);
            if (word.charAt(i) != word.charAt(i + 1)) {
                if(temp.length() > longestSubstring.length()){
                    longestSubstring = temp;
                }
                temp="";
            }
        }


        System.out.println(longestSubstring);
    }
}