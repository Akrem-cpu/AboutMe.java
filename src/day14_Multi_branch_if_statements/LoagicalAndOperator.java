package day14_Multi_branch_if_statements;

public class LoagicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(10==10 && 20!=20);

        int apples = 10 , oranges = 5;
        boolean check = apples >5 && oranges >3;
        System.out.println("check = " + check);
    }
}
