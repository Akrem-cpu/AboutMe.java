package OfficeHours.practice_03_03_2021;

public class Stage1calculator {
    public static void main(String[] args){
        double numOne = 20.0 ,numTwo = 5.0;
        double addition = numOne + numTwo;
        double subtraction = numOne - numTwo;
        double multiplication = numOne * numTwo;
        double division = numOne / numTwo;
        double remainder = numOne % numTwo;

        System.out.println("calculation for "+ numOne + "&" + numTwo);
        System.out.println(numOne +" + " +numTwo + " = " + addition );
        System.out.println(numOne +" - " +numTwo + " = " + subtraction );
        System.out.println(numOne +" * " +numTwo + " = " + multiplication );
        System.out.println(numOne +" / " +numTwo + " = " + division );
        System.out.println(numOne +" % " +numTwo + " = " + remainder );
    }
}
