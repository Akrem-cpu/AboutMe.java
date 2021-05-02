package MyOwn;

import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber ="calling number (" + areaCode +")-" + localNumber  ;
        //WRITE YOUR CODE HERE:
        System.out.println(phoneNumber);

    }
}
