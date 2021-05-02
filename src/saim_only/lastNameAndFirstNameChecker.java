package saim_only;

public class lastNameAndFirstNameChecker {
    public static void main(String[] args) {
        String fullName = "james bound";
        String name = "bound";
        if (fullName.contains("bound")){
            System.out.println("same last name");
        }else{
            System.out.println("not the same last name.");
        }
    }
}
