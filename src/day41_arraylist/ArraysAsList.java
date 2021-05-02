package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(23,1,34,54,654));
        System.out.println("nums = " + nums);
        nums.add(0,100);
        System.out.println(nums);
        ArrayList<Double> nums1 = new ArrayList<Double>(Arrays.asList(234.2,23.2,56.2,1.0));
        nums1.add(0,88.5);
        System.out.println(nums1);

        List<String> drinkWithCoffine = new ArrayList<String>(Arrays.asList("coffee", "tea","monster" , "red bull" , "coke", "pepsi", "mdew" , "kambucha", "celsius"));
        int amountOfCaffine = 0;
        for (String each : drinkWithCoffine) {
            switch (each){
                case "monster" : case "red bull" : case "celsius":
                    amountOfCaffine = 150;
                    System.out.println(each + "---Amount of caffeine --->" + amountOfCaffine);
                   break;
                case "coffee" : case "kambucha":
                    amountOfCaffine = 112;
                    System.out.println(each + "---Amount of caffeine --->" + amountOfCaffine);
                    break;
                case "tea" : case "pepsi" : case   "coke":
                    amountOfCaffine = 35;
                    System.out.println(each + "---Amount of caffeine --->" + amountOfCaffine);
                    break;

            }
        }

        drinkWithCoffine.forEach(each -> System.out.print(each));




    }
}
