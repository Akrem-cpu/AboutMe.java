package day29_nestedLoop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int outerM = 1; outerM < 12 ; outerM++) {
            for (int innerM = 1; innerM <= 10; innerM++) {
                System.out.print(outerM*innerM+ "\t" );

            }

            System.out.println();
        }


    }
}
