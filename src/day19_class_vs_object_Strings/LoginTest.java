package day19_class_vs_object_Strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "ABc123";

        String userName = "CYBERTEK";
        String password = "ABc123";

        if (expUserName.equalsIgnoreCase(userName)){
            if (expPassword.equals(password)){
                System.out.println("welcome" + Instant.now());// get exact time.
            }else {
                System.out.println("incorrect password ");
            }
        }else {
            System.out.println("invalid input");
        }



    }
}
