package day11_comparison_operators;

public class prePostIncreementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =  ++num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 10;


        System.out.println("num3 = " + num3++);
        System.out.println("num3 = " + num3);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);





    }
}
