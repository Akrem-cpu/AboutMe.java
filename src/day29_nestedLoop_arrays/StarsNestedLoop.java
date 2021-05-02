package day29_nestedLoop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {

        for (int outer = 0 ; outer <=10 ; outer++){
            System.out.println();
            for (int inner = 0 ; inner <= outer; inner++){
                System.out.print("\uD83C\uDF20 ");
            }
        }
        for (int outer = 0 ; outer <=10 ; outer++){
            System.out.println();
            for (int inner = 10 ; inner >= outer; inner--){
                System.out.print("\uD83C\uDF20 ");
            }
        }


    }
}
