package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int Stars = 1 ; Stars <=15 ; Stars++ ){
            System.out.print(" * " + Stars);
        }
        System.out.println();
        String myStars = "";

        for ( int Stars = 1 ; Stars <=10 ; Stars++  ){
            myStars+="* ";
        }


        System.out.println("myStars = " + myStars);



    }
}
