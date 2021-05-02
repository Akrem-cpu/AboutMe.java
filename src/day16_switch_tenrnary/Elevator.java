package day16_switch_tenrnary;

public class Elevator {
    public static void main(String[] args) {
       int floorNum = 3;

       if (floorNum == 1){
           System.out.println("Floor 1 selected. Companies: Cybertek");
       } else if ( floorNum == 2){
           System.out.println("Floor 1 selected. Companies: Cybertek");
       }else if ( floorNum == 3){
           System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
       }else {
           System.out.println("Invalid floor - " + floorNum);
       }
        System.out.println("================================== Switch statement version");


       switch (floorNum){
           case 1:
               System.out.println("Floor 1 selected. Companies: Cybertek");
               break;
           case 2:
               System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
               break;
           case 3:
               System.out.println("yes akrem");
               break;
           default:



       }




    }
}
