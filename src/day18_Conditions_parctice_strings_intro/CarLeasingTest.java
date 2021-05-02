package day18_Conditions_parctice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "A";
        double leasingPrice = 0.0;

        if (make.equals("Mercedes")){
             switch (model){
                 case "A":
                     leasingPrice = 500;
                     break;
                 case "E":
                     leasingPrice = 400;
             }
        }else if (make.equals("Audi")){
            switch (model){
                case "SQ5":
                    leasingPrice = 552;
                    break;
                case "A3":
                    leasingPrice = 412;
                    break;

            }
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasingPrice = " + leasingPrice);



    }
}
