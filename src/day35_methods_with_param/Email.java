package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        BuildEmail("akrem", "gmail");
    }


    public static void BuildEmail(String name, String domain){
        System.out.println(name+ "@" + domain+".com");


    }
}
