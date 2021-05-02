package MyOwn;

import java.util.*;

public class check2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        // WRITE YOUR CODE HERE
        int[] a = new int [num];
        a[0] = 1;
        a[1] = 1;
        for (int i = 0 ; i < a.length-2 ; i++){

            a[i+2] = a[i] + a[i+1];
        }
        System.out.println(a[a.length-1]);

    }









}


