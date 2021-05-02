package day40_arrayslist;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(5);
    nums.add(7);
    nums.add(11);


        System.out.println("size = " + nums.size());

        // reading from arraylist

        System.out.println("index = " + nums.get(0));

        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);


    }
}
