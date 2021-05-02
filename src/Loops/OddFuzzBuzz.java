package Loops;

public class OddFuzzBuzz {
    public static void main(String[] args) {


        for (int i = 1; i <= 100 ;i++){

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0 ){
                System.out.println("this number is even and divisible by 3 and 5 =" + i);

            }else if (i % 2 != 0 && i % 3 == 0 && i % 5 == 0 ){
                System.out.println("this numbers are odd and divisible by 3 and 5 =" + i);
            }





        }



    }
}
