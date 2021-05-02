package Loops;

public class CountUpperLowerAndNumber {
    public static void main(String[] args) {
        String word = "2juMp41EEkd4s4";
        int numberCount = 0;
        int upperCount = 0;
        int lowCount = 0;
        for (int i = 0 ; i < word.length() ; i ++){
            char single = word.charAt(i);
            if ('9' >= single && single >='0'){
                numberCount++;
            } else if ('Z' >= single && single >='A'){
                upperCount++;
            }else if ('z' >= single && single >='a'){
                lowCount++;
            }


        }
        System.out.println("Lower case  = " + lowCount);
        System.out.println("upper case = " + upperCount);
        System.out.println("number = " + numberCount);


    }
}
