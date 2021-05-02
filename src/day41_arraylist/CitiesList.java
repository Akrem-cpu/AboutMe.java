package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<String> clone = new ArrayList<String>();
        cities.add("version");
        cities.add("new york");
        cities.add("Chicago");
        cities.add("LA");
        cities.add(0,"LA");
        System.out.println(cities);
        System.out.println(cities.get(1));
        System.out.println(cities.get(cities.size()-1));
        int size = cities.size();
        System.out.println(size);
        for (int i = 0; i < cities.size() ; i++){
            System.out.print(cities.get(i) + " / ");
        }
     for (String each : cities){
         System.out.print(each +" ");
     }

     cities.remove(0);
     cities.remove("LA");
        System.out.println(cities);
        System.out.println(cities.clone());
        System.out.println(cities.isEmpty());
        System.out.println(cities.subList(1, 3));

    }
}
