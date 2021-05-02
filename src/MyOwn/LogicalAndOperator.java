package MyOwn;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(2 > 4 && 4 < 6);
        boolean b = 10 == 10 && false;
        System.out.println("b = " + b);
        String drink = "coffee";
        boolean hot = true;
        boolean free = true;

        boolean bool = drink.equals("coffee") && hot && free;
        System.out.println("bool = " + bool);


        int a = 100;//100
        int c = a++;
        System.out.println("a = " + a);//100
        System.out.println("c = " + c);//
        System.out.println("a = " + a++);
        System.out.println("a = " + a);

        int i = 100;
        byte b1 = 123;
        float f = 300;
        i = b1;


    }
}
