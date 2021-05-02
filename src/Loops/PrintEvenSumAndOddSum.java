package Loops;

public class PrintEvenSumAndOddSum {
    public static void main(String[] args) {
        int sumOdd = 0;
       int sumEven = 0;
        for (int i = 0 ; i <=100; i++){

            if (i % 2 == 0){
                sumEven += i;

            }else if (i % 2 !=0){
                sumOdd += i;
            }

        }
        System.out.println("sumEven = " + sumEven);
        System.out.println("sumOdd = " + sumOdd);




    }

}
