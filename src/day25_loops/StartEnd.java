package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you start and end number");
        int start = scan.nextInt();
        int end = scan.nextInt();
          if ( start > end){
              System.out.println("revers Numbering is not supported");
          }else {
              for (int i = start; i <=end ; i++) {
                  System.out.print(" " + i);
              }
          }

    }
}
