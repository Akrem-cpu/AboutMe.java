package MyOwn;

import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600;
        int remainingSecondsFromHours = inputSeconds % 3600;
        minutes = remainingSecondsFromHours / 60;
        int remainingFromMinutes = remainingSecondsFromHours % 60;
        seconds = remainingFromMinutes;

        System.out.println(hours + " hours, " + minutes + " minutes  and " + seconds);

        long kiloMeter, meter, centMeter;
        // 100000 cm = 100000 kilometer.
        System.out.println("Enter cent meter:");
        int inputCentMeter = scan.nextInt();

        kiloMeter = inputCentMeter / 100000;
        long leftFromKiloMeter = inputCentMeter % 100000;
        meter = leftFromKiloMeter / 1000;
        long leftFromMeter = meter % 1000;
        centMeter = leftFromMeter;

        System.out.println("kiloMeter = " + kiloMeter);
        System.out.println("meter = " + meter);
        System.out.println("centMeter = " + centMeter);
        String a = " ahf";



    }
}
