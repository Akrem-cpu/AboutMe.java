package day22_String_manipulations;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        // for a middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");


        int idxOf = technologies.indexOf("css");
        System.out.println(idxOf);

        int idxCucumber = technologies.indexOf("cucumber");
        System.out.println(idxCucumber);


        if(technologies.indexOf("maven") > -1){

        }


    }
}
