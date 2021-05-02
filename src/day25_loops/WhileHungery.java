package day25_loops;

public class WhileHungery {
    public static void main(String[] args) {

        boolean isHungery = true;
        int bananas = 0;
        int countFull = 3;

        while (isHungery){
            bananas++;
            System.out.println(" eating banana : " + bananas + "\uD83C\uDF4C"  );

         if (bananas == countFull){
               isHungery = false;
            }



        }
        System.out.println(" i am full");


    }
}
