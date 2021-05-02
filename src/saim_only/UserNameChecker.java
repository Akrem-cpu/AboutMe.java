package saim_only;

public class UserNameChecker {
    public static void main(String[] args) {
        String userName = "akrem";
        String password = "akrem 123";


        if (userName.length() > 5 && (!password.contains(userName))){
            System.out.println("valid password");
        }else {
            System.out.println("Invalid password, username should not be in it " + password);
        }


    }
}
