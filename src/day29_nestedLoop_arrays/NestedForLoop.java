package day29_nestedLoop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
    /*    for (int minutes = 1 ; minutes<=5 ; minutes++){
            System.out.println("\nminutes = " + minutes);
            for (int seconds = 1 ; seconds <=60 ; seconds++){
                System.out.print(seconds + "");
            }
        }*/


        for (int minutes = 0; minutes <= 4; minutes ++) {
            for (int second = 0 ; second<=60 ; second++){
                System.out.println( minutes +":" + second);


            }



        }


    }
}
