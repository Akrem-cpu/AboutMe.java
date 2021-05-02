package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        i++;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        linesOfCode = 16;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode + 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode += 1;
        System.out.println("linesOfCode = " + linesOfCode);
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode = linesOfCode-1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode-= 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode--;
        System.out.println("linesOfCode = " + linesOfCode);
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char latter = 'a';
        System.out.println("latter = " + latter);
        latter++;
        System.out.println("latter = " + latter);

          long a = 3_000l;
          double b = (float) a;
        System.out.println("b = " + b);


    }
}
