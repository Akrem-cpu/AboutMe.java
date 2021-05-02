package day16_switch_tenrnary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        int calories  = 0;

        if (size.equals("tall")){

        }
        switch (size){
            case "tall":
                price = 3.90;
                calories = 90;
                System.out.println("Tall Cappuccino please");
                break;
            case "grade":
                price = 3.99;
                calories = 120;
                System.out.println("Grande Cappuccino please");
                break;
            case " venti":
                price = 4.29;
                calories = 150;
                System.out.println( "Venti Cappuccino please");
                break;
            default:
                System.out.println("We do'nt serve that size of Cappuccino"
                );
        }

        System.out.println("Total price: $" + price+
                "You will consume " + calories + "cal of energy");






    }
}
