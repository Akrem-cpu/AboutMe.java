package day40_arrayslist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("Size  = " +shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());
        if ( shoppingList.isEmpty()){
            System.out.println("it is empty");
        }else {
            System.out.println("it is not empty");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);


        System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));

        System.out.println("Buying shoes ... $80");
        shoppingList.remove("shoes");
        System.out.println(shoppingList);


    }
}
