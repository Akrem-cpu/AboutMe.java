package day18_Conditions_parctice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args){
        int last4Ssn = 1234;
        int pinCOde = 123;
        int attempted = 4;


        if (last4Ssn == 1234  ){
            System.out.println("Authentication successfully");
            if (pinCOde == 1234){
                System.out.println("pic cod expected successfully");
            }else {
                System.out.println("pic code is not correct");
                switch (attempted){
                    case 4:
                        System.out.println("you have attempted more 4 time. you account is locked for 24 hours.");
                }
            }
        }else {
            System.out.println("SSN is not correct");
        }







    }
}
