package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        double kanaf = 44.45;
        System.out.println("kanaf = " + kanaf);
        balance = balance - kanaf;
        System.out.println("balance = " + balance);
        
        double icedtea = 3;
        System.out.println("icedtea = " + icedtea);
        balance = balance - (icedtea*4);
        System.out.println("balance = " + balance);


        System.out.println("baklava = " + baklava);
        balance = baklava + balance;
        System.out.println("balance = " + balance);

        balance *= icedtea;
        System.out.println("balance = " + balance);
    }
}
