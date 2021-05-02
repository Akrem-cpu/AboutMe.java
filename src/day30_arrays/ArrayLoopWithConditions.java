package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] price = {22.9 , 12.4 , 43.12 , 65.0 , 100.4 , 543.23 , 98.32};

        String[] countries = new String[]{"Brazil", "China",
                "Cuba", "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        System.out.println("-----------price more than 100--------");
        for (double each : price){
            if (each > 100){
                System.out.println(each);
            }
        }
        System.out.println("-------------price between 10 and 70-------- ");
        for (double each:price){
            if (each >=20 && each >= 70){
                System.out.println(each);
            }
        }
        System.out.println("------------------count of prices that are more than 50--------------------");
        int count= 0 ;
        for (double each : price){
            if (each >= 50){
               count++;
            }
        }
        System.out.println(count);

        System.out.println("------------countries with name length more than 7 - inclusive-------------");

        for (String name : countries ){
            if (name.length() >= 7){
                System.out.print(" " + name);
            }
        }
        System.out.println();


        System.out.println("string" + (5 * 4));
                      //    string54
                      //    string20



 char a = 'a';
 char b = 'c';
        System.out.println(" " + a +" "+ b + "");


    }
}
