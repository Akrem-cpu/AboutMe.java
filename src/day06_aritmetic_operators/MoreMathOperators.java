package day06_aritmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        //Toyota - 431 Hondas - 233 VW - 20 nissan - 1 bmw- 155
        int Toyota = 431, hondas = 233 , vw = 20 , nissan = 1, bmw = 155;
        int totalCarsInParking = Toyota + hondas + vw + nissan + bmw;
        System.out.println("There are " + totalCarsInParking +" Cars in parking lots");

        String pizza = "hawaiian";
        double slices = 8;
        int peoples = 3;
        System.out.println("there will be " +slices / peoples + " per person");
        System.out.println("we ordered "+ pizza + " pizza with " + slices +" each person got "+ slices/peoples+ "Pizza");




    }
}
