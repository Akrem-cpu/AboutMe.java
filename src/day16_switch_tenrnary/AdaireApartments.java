package day16_switch_tenrnary;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedRoom = 0;
        double startingPrice = 0;

        switch (numberOfBedRoom){
            case 0:
              startingPrice = 1454;
                System.out.println("startingPrice = " + startingPrice);
                break;
            case 1:
                startingPrice = 1750;
                System.out.println("startingPrice = " + startingPrice);
                break;
            case 2:
                startingPrice = 2899;
                System.out.println("startingPrice = " + startingPrice);
                break;
            default:
                System.out.println("we have no house");


        }




    }
}
