package saim_only;

public class parctice02 {

    /**  Create a class Employee
     create a main method

     Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)

     - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

     Declare new variables and use concatenation from previous variables to set their values

     - full name (first and last name)
     - full start date (start month date, year)
     - email (first name + start day @ $company name .com)
     - Salary after 3 years (base salary + start month * 10000)
     Ex: base: 100000
     start day: 2
     after 3 year: (100000 + (2 * 1000)) = 102000

     Display the values of the variables following given example image
     */
    public static void main(String[] args) {
        String firstName = "james", lastName = "bound", companyName = "Tesla" , startMonth = "January";
        String jobTitle = "QA tester engineer" , officeAddress = "100 s laneHampton, VA 13312 ";
        String companyEmail = "james4@tesla.com";
        double salary = 100000; int startDay = 4 , startYear = 2021;
        boolean fullTime = true;
        String fullName = firstName + lastName;
        String fullStartDate = startMonth + " " + startDay +"," + startYear;
        String emil = firstName + fullStartDate + companyEmail;
        double salaryAfter3Years = salary +(2*1000);
        // print time lol
        System.err.println("     ********** Tesla new hire information********\nJames welcome to Tesla");
        System.err.println("your start date as a SDET will be on " + fullStartDate + ".");
        System.err.println("You are a full time: " +fullTime + " and you will make " + salary +" per year.");
        System.err.println("the office location at:\n"+ officeAddress);
        System.err.println("\n    Official Information");
        System.err.println("New hire name: " + firstName);
        System.err.println("Start on: " + fullStartDate);
        System.err.println("Email generated: " + companyEmail);
        System.err.println("Your expected salary after 3 years: " + salaryAfter3Years);
        System.err.println("see you monday. don't be late.");


    }
}
