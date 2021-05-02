package day40_arrayslist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();// polymorphic way of declaring
        System.out.println(nums);
        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(847); nums.add(0);
        System.out.println("nums = " + nums.remove(0));
        System.out.println("removing this number = " + nums.remove(0));
        System.out.println("removed = "+ nums);

        // nums.remove(88) -->
        nums.remove(new Integer(88));
        System.out.println(nums);
//        System.out.println(nums.remove("88"));
        for (int i = 0 ; i < nums.size() ; i++){
            System.out.println(nums.get(i));

            // for each loop with list

            for (int each : nums){
                System.out.print(each+" ");
            }

        }
    }
}
