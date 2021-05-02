package saim_only;

public class House {
    public static void main(String[] args){
        String houseType = "Full house";
        int numberOfBedroom = 5;
        double numberOfBathroom = 3.5;
        int numberOfKitchens = 1;
        boolean basement = true;
        boolean attic = false;
        boolean pool = true;
        boolean isTheHouseForSale = true;
        double costOfTheHouse = 1000000;
        String address = "1100 north east avenue";
        int zipCode = 60656;
        boolean isAParkNearBy = false;
        byte ratingOfSchool  = 5;
        // print time
        System.out.println("House Type is:\t\t\t" +houseType + "\nNumber of bedroom is:\t" + numberOfBedroom);
        System.out.println("Number of Bathroom is\t"+ numberOfBathroom + "\nNumber of kitchens is:\t" + numberOfKitchens);
        System.out.println("Basement:\t\t\t\t" + basement+ "\nAttic:\t\t\t\t\t" + attic +"\nPool in the house:\t\t"+ pool);
        System.out.println("The house is on sale:\t" + isTheHouseForSale +"\nCost of the house is:\t$" + costOfTheHouse);
        System.out.println("Address:\t\t\t\t" + address + "\nZipcode is:\t\t\t\t" + zipCode);
        System.out.println("Nearby park:\t\t\t"+ isAParkNearBy );
        System.out.println("School near by rating :\t" + ratingOfSchool);




    }

}
