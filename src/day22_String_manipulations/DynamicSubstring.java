package day22_String_manipulations;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result  = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.lastIndexOf(":") );
        int colonIndex = result.lastIndexOf(":");
        System.out.println(result.substring(++colonIndex  ));
        String today = "i learn [Akrem] today ";

        System.out.println(today.substring(today.indexOf("[")+1,today.lastIndexOf("]")));


    }
}
