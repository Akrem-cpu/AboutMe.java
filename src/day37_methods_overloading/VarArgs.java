package day37_methods_overloading;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        var(1,2,3,4);
    }





    public static void var(int ... a){
        System.out.println(Arrays.toString(a));
    }


}
