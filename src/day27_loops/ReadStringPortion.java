package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "car, car, cat red car, java, selenium";
        for (int i = 0; i < list.length() - 3 ; i++){

            if (list.equals("cat") || list.equals("car")){
                System.out.println(list.substring(i , i+3) );
                System.out.println("car or car found");
            }




        }
        System.out.println(list);
    }
}
