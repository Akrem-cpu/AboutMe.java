package day26_loops;

public class WeekDays {
    public static void main(String[] args) {

        for (int i = 1 ; i < 10 ; i++ ){
            switch (i){
                case 1 :
                    System.out.println("Monday =" + i);
                    break;
                case 2 :
                    System.out.println("Tuesday =" +i);
                    break;
                case 3 :
                    System.out.println("Wednesdays =" + i);
                    break;
                case 4 :
                    System.out.println("thursday =" + i);
                    break;
                case 5 :
                    System.out.println("friday =" + i);
                    break;
                case 6 :
                    System.out.println("Saturday =" + i);
                    break;
                case 7:
                    System.out.println("sunday =" + i);
                    break;
                default:
                    System.out.println("no such day, it is java day =" + i);



            }



        }




    }
}
