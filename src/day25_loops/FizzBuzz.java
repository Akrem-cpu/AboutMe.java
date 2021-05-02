package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 3;
        for (int i = 1 ; i <= 100 ; i++){
            if (num % 3 == 0 && num % 5 == 0 ){
                System.out.println("fuzzBuzz" );
            }else if (num % 3 == 0){
                System.out.println("Fuzz");

            }else if (num % 5 == 0 ){
                System.out.println("Buzz");
            }else {
                System.out.println("No buzz");
            }

        }


    }
}
