package day37_methods_overloading;

public class WarmUpMethods {
    public static void main(String[] args) {
        login(123 , "akrem" );
        System.out.println(loginR("abds", "Akrem"));
    }








    public static void login(int password, String name) {
            if (password == 123 && name.equalsIgnoreCase("Akrem")) {
                System.out.println("login successful, welcome cybertek student ");

            } else {
                System.out.println("wrong user name or passcode");

            }

    }
    public static boolean loginR (String username , String passcode) {
        if (username.equals("123abc") && passcode.equalsIgnoreCase("Akrem")) {
            return true;
        }else {
            return false;
        }
    }








}
