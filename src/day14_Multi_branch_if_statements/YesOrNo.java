package day14_Multi_branch_if_statements;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure you want to delete this file?");
        String selection = scan.next();
        boolean selection1 ;

        if (selection.equals("y")) {
            System.out.println("this file will be deleted " + "\n true");
          selection1 = true;
        } else {
            System.out.println("file deletion cancelled" + "\ntrue");
            selection1 = false;
        }
        System.out.println("did file get deleted? - " +  selection1);
    }
}
