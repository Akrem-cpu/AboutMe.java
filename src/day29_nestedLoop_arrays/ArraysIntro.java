package day29_nestedLoop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int[] nums = new int[4] ;
        nums [0] = 5;
        nums [1] = 10;
        nums [2] = 7;
        nums[3]= 10;
        System.out.println("value at index 0 = " +nums[0]);
        System.out.println("value at index 1 = " +nums[1]);
        System.out.println("value at index 2 = " +nums[2]);
        System.out.println("value at index 2 = " +nums[3]);

        System.out.println("number of element  = " + nums.length);

        int lengthOfArrray = nums.length;
        System.out.println(lengthOfArrray);

        nums[0]= 100;
        nums [1] = 300;
        nums [2]= nums[0];
        System.out.println("nums = " + nums[0]);


        int[] nums2 = {144, 2, 3, 4, 5, 6};
        System.out.println(nums2.length);


   }
}

