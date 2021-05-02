package day38_methods;
import static day38_methods.ArraysUtils.*;
public class ArrayUtilTest {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        PrintArray( new int[] {1,2,3,4,3,5,355342,354,53,35});
        System.out.println(sum(new int[]{1, 3, 4, 5,}));
        System.out.println(Contains(nums , new int[] { 1,2,3}));
        System.out.println(Contains(new int[]{1,1,2,3,4}, new int[]{1,1,2,3,4}));
        boolean a = Contains(new int[]{1,1,2,3,4}, new int[]{1,1,2,3,4});
        PrintArray(new int[] {1,2,3});

    }
}
