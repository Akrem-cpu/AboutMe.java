package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args){
        int count = 3;
        System.out.println("count = " + count);
        // add/increase 2 more to count
        count = count + 2;
        System.out.println("count = " + count);
        int apples = 10;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices + pizzaSlices;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int cents = 244;
        System.out.println("cents = " + cents);
        // keep the change
        cents = cents % 100;
        System.out.println("cents = " + cents);

    }
}
