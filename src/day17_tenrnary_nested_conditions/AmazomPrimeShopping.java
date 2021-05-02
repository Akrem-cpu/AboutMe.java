package day17_tenrnary_nested_conditions;

public class AmazomPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 10;
        boolean isPrimeMember = true;

        if (!isPrimeMember){
            System.out.println("eligible for free 2 day shipping ");
        }else {
            if (itemPrice > 25){
                System.out.println(" eligible for free regular shipping");
            }else {
                System.out.println("not eligible for free shipping ");
            }


        }



    }
}
