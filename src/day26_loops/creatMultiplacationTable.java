package day26_loops;

public class creatMultiplacationTable {
    public static void main(String[] args) {
         int mainNumber = 1;
         if (mainNumber < 1 || mainNumber >12){
             System.out.println("error");
             return;
         }

            for (int i = 0; i <= 12; i++) {
                System.out.println(mainNumber + " * " + i + " = " + (mainNumber * i));


            }



    }


}
