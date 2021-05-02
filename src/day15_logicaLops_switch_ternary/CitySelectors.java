package day15_logicaLops_switch_ternary;

public class CitySelectors {
    public static void main(String[] args) {
        String city = "Ethiopia ";

        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("we are traveling");
        }else {
            System.out.println("i am not going anywhere");
        }
        String teacher = "saim";

          if (teacher.equals("saim") || teacher.equals("Murodil")) {
              System.out.println("It is a java class with " + teacher);

        }else {
              System.out.println("soft skill class with " + teacher);
          }

          String company = "google";
          double salary = 90_000.0;

          if (company.equals("google") || salary>= 100_000 ){
              System.out.println("accept offer ");
          }else {
              System.out.println("refuse offer");
          }


    }
}
