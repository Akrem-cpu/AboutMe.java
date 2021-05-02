package array;

public class hunderedNumbersArray {
    public static void main(String[] args) {
        int[] numbers = new int[101];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i;

        }

        for (int each : numbers) {
            System.out.print(each+" ");
        }



    }
}
