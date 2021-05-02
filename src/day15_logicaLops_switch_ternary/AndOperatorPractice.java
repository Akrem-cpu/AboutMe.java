package day15_logicaLops_switch_ternary;
import java.util.*;
public class AndOperatorPractice {
    public static void main(String[] args){
       boolean onSale = true;
       boolean freeShipping = true;
       String itemName = "wooden spoon";
       int itemPrice = 100;


        if (onSale && freeShipping ){
            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("continue shopping for good deals on - " + itemName);
        }
        if (onSale && freeShipping && itemName.equals("wooden spoon") && itemPrice <100 ){
            System.out.println("Adding to court");
        }else {
            System.out.println("dont add to court.");
        }











    }
}
