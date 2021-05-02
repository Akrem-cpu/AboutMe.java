package OfficeHours.practice_03_03_2021;
        /*
Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
        You are $age years old! That means you are $days days old
    */


public class AgeToDays {
    public static void main(String[] args) {
        int age = 26;
        int ageInDays = 365 * age;
        int ageInHours = ageInDays * 24;
        System.out.println("you are " + age + " years old! " + " that means you are " + ageInDays);
        System.out.println("you are " + age + " years old! " + " that mean you are " + ageInHours + " hours");



    }

}
