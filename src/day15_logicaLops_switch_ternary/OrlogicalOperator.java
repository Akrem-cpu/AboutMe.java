package day15_logicaLops_switch_ternary;

public class OrlogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true =" + (true || true));
        System.out.println("true || false =" + (true || false));
        System.out.println("false || true =" + (false || true));
        System.out.println("false || false =" + (false || false));
         int apples = 5;
         int oranges = 7;

        System.out.println(apples > 3 || oranges >4);

        if(apples > 3 || oranges >4){
            System.out.println("no need to buy any fruits today");
        }else {
            System.out.println("Need to get some fruits.");
        }




    }
}
