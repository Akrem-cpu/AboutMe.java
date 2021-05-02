package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 2 == 0){
                System.out.print( i);
            }
        }

        System.out.println();

        for (int I = 1; I <= 100; I++) {
            if (I % 2 != 0) {
                System.err.print( I);
            }
        }






    }
}
