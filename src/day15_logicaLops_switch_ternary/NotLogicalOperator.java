package day15_logicaLops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args){
        System.out.println("!ture =" + (!true));
        System.out.println("!ture =" + (!false));
        int age = 2;
         if (!(age > 7)){
             System.out.println("Need to sit in for child in the car");
         }else {
             System.out.println("you dont need a child sit");
         }

         boolean isSmokingAllowed = false;

         if(!isSmokingAllowed){
             System.out.println("Smoking is not allowed here.");
         }else {
             System.out.println("Smoking is allowed");
         }

         boolean isAffordable = true;
         if(!(isAffordable)){
             System.out.println("you can buy");
         }else {
             System.out.println("you can\'t buy it ");
         }

         String secretPassword = "abc123";
         String inputPassword = "abc123";

         if (!(secretPassword.equals(inputPassword))){
             System.out.println("not wright");
         }else {
             System.out.println("right");
         }






    }
}
