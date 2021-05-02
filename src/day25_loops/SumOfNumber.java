package day25_loops;

public class SumOfNumber {
    public static void main(String[] args) {
        long sum = 1L;

        for (int i = 1; i <=16 ; i++){
            sum = sum * i;
        }
        System.out.println("sum = " + sum);


    }
}
