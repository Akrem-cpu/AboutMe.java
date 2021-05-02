package day19_class_vs_object_Strings;

public class StringLength {
    public static void main(String[] args){
        String word = "java";
        System.out.println("word = " + word);
        System.out.println( word.length());
        System.out.println( "count - " + word.length());
        String firstName = "Akrem";
        System.out.println(firstName + " = length =  " + firstName.length());


        String password = "abc123";
        int count = password.length();
        if (count >= 6 && count <=25  ){
            System.out.println("your password is expected");
        }else {
            System.out.println("please entre a password with at least 6 characters.");
        }



    }
}
