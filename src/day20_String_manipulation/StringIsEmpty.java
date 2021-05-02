package day20_String_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle ="heheh";
        System.out.println(jobTitle.length() == 0 ); // true
        System.out.println(jobTitle.isEmpty()); // true
        System.out.println(jobTitle.equalsIgnoreCase(""));

        if (jobTitle.isEmpty()){
            System.out.println("Job title is missing, please resend.");
        }else {
            System.out.println("job title looks good.");
        }

        if (jobTitle.length() == 0){
            System.out.println("Job is empty");
        }else {
            System.out.println("job is not empty ");
        }
           if ( jobTitle.equals("")){
               System.out.println("job is very empty");
           }else {
               System.out.println("job is not empty");
           }

        System.out.println(jobTitle.contains("h"));

    }
}
