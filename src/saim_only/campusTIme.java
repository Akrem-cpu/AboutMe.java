package saim_only;

import java.util.Scanner;
//Campus time:User enters a time(hour in 24hour format)and will be able to find out if the campus is open or no
// >Campus is open from 8am(8)to 11pm(23)
//>If user enters a time within the open time they should see message: “open” but if the time entered is outside of operating hours they should see: “ closed”
//>If the user enters an invalid hour(negative number or more than 24hours)they should see an error message: “invalid time”

        public class campusTIme{
        public static void main(String[]args){
          Scanner scan = new Scanner(System.in);

            System.out.println("please enter the time in 24 hours format");
            int hours = scan.nextInt();

            if (hours >= 0 && hours <= 24 ) {
                if (hours >= 8 && hours <= 23) {
                    System.out.println("campus is opened.");
                }else if (hours >8 && hours <=0  || hours == 0) {
                    System.out.println("Campus is closed ");

            }

            }else {
                System.out.println("invalid time");
            }





        }
        }
