package array;

public class MaxAndMinArrays {
    public static void main(String[] args) {

        int [] number = {2,3,4,5,6};
        int max = number[0];
        int min = number[0];


        for (int each : number) {
            if (each > max){
                max = each;

            }
            if (each < min){
                min = each;
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
