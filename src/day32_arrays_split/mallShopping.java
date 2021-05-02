package day32_arrays_split;

public class mallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "ipad", "iphone 11 case"};
        double[] price = {99.99  ,   150.0 ,   9.99   ,   250.0,  439.40,       39.99 };
        int[] itemID =    {12345,    12346,    12347  ,     12348 , 12349,     12350       };


        System.out.println("----------------- Find the index of gloves in item arrays ------------");
        int indexOfGloves = -1;
        int count = -1;
        for (String each : items) {
            count++;
            if (each.equals("Gloves")){
                indexOfGloves = count;
                System.out.println(indexOfGloves);
                break;
            }


        }

        System.out.println("-------------det boolean to true if first ipad is fount ----------");
        boolean ipadExsited = false;
        for (String each: items) {
            if (each.equals("ipad")){
                ipadExsited = true;
                break;
            }

        }
        System.out.println(ipadExsited);


        System.out.println("------------------print a report of eac shopping list ----------------");

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item name " + items[i] + " price " + price[i] + " $ ID #" + itemID[i]);

        }
        System.out.println("---------------look for jacket in items and print all deatials-------  ");
           count =0;
        for (String each  : items ) {
            count++;
            if (each.equalsIgnoreCase("Jacket")){
                System.out.println("Item name " + each + " price " + price[count] + " $ ID #" + itemID[count]);
                break;
            }

        }





      }
}
