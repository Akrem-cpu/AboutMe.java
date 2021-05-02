package day17_tenrnary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args){
        String selection = "drink" ;
        String drinksItem = "tea" ;
        String snackItem ="chips";

        if (selection.equals("drink")){
            System.out.println("drink selected");

            if (drinksItem.equals("coko")){
                System.out.println("Coko is selected ");
            } else if (drinksItem.equals("tea")) {
                System.out.println("tea is selected");
            }else {
                System.out.println("invalid input");
            }
        }else if (selection.equals("snack")){
            if (snackItem.equals("chips")){
                System.out.println("chips has been selected ");
            }else if (snackItem.equals("cake")){
                System.out.println("cake its been selected ");
            }else {
                System.out.println("invalid input");
            }




        }

       int num = 9;
        if (num++ == 10 ){
            System.out.println("hello world " + num);
        }else {
            System.out.println("hello Universe " + num);
        }





    }
}
