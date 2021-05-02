package day15_logicaLops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 4000.0;
        double carPrice = 1000.0;
        String model = "Akrem";

        if (  (model.equals("Toyota")  || model.equals("Tesla") ||
                      model.equals("Akrem")) && carPrice <= budget   ){
            System.out.println("this is the car for you ");
        }else {
            System.out.println("look for a better deal");
        }
    }
}
