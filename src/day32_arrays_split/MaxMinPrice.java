package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {


    String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "ipad", "iphone 11 case"};
    double[] price = {99.99  ,   150.0 ,   9.99   ,   250.0,  439.40,       39.99 };
    int[] itemID =    {12345,    12346,    12347  ,     12348 , 12349,     12350       };
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(itemID));
    double max = price[0];
    int indexOfMax = 0;
    double min = price[0];
    int indexOfMin = 0;
        for (int i = 0; i < items.length; i++) {
            if(price[i] > max){
                max = price[i];
                indexOfMax = i;
            }
            if (price[i] < min){
                min = price[i];
                indexOfMin = i;
            }

        }

        System.out.println("the expansive one is "  +items[indexOfMax] + " - $" + price[indexOfMax] + " - ID = " + itemID[indexOfMax] );
        System.out.println("the cheapest one it"+items[indexOfMin] + " - $" + price[indexOfMin] + " - ID = " + itemID[indexOfMax] );









    }
}
