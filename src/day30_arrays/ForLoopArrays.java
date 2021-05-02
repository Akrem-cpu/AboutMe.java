package day30_arrays;

public class ForLoopArrays {
    public static void main(String[] args) {
        int[] data = {32,532,23,34453,35,3544,32,999};

        for (int each  : data ){
            System.out.print((" "+each ));
        }

        for (int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);

        }
        System.out.println(data[data.length-1]);
        for (int i = data.length-1; i > 0 ; i--) {
            System.out.print(data[i]);

        }


    }
}
