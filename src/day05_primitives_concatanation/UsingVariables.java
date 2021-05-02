package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        num1 = 200;
        num2 = num1;
        System.out.println(num2);
        System.out.println(num1);
        int n1= 1000;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n3);
        int inthiresZipcode = 22182;
        int parvinsZipCode = inthiresZipcode;
        System.out.println(parvinsZipCode);
        System.out.println(inthiresZipcode);
        inthiresZipcode = 20007;
        parvinsZipCode = 33131;
        System.out.println(inthiresZipcode);
        System.out.println(parvinsZipCode);
    }
}
