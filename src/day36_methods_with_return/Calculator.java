package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(4,5));
        System.out.println(subtract(100,300));

    }



    public static double add(double n , double a){
        return n + a ;
    }
     public static double subtract ( double a , double n){
        return a - n ;
     }
     public static double Multiple (double a , double n ){return a * n;}
     public static double division (double a , double n){return a / n;}


}
