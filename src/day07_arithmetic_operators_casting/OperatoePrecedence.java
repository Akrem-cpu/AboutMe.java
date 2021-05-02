package day07_arithmetic_operators_casting;

public class OperatoePrecedence {
    public static void main(String[] args){
        System.out.println(10+5);
        System.out.println(5*3-10);
        System.out.println(20/(2*2));
        System.out.println(10/3d);// runtime exception
        System.out.println(2+5*3);
        System.out.println((2+5)*3);
        System.out.println(10/3);
        System.out.println(5.0/2.0);
    }
}
