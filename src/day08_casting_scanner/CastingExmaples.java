package day08_casting_scanner;

public class CastingExmaples {
    public static void main(String[] args){
        // byte - short - int - long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        long num4 = num1;
        // float - double
        float num6 = num1;
        double num7 = num1;
      //  System.out.println("num7 = " + num7);
        int num10 = 3000;
        byte num11 = (byte) num10;
       // System.out.println("num11 = " + num10);
        System.out.println("num11 = " + num11);
        char letter = 'A';
        int numLetter = letter;
        System.out.println("numLetter = " + numLetter);

    }

}
