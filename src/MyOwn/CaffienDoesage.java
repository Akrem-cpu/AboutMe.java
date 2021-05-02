package MyOwn;

import java.util.Scanner;

public class CaffienDoesage {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter number of milligrams in drink:");
        int caffeineInMilligrams = scan.nextInt();

        int caffeineInGram = 10*1000/caffeineInMilligrams;//mg




        System.out.println("It would take about " + caffeineInGram + " drinks for a lethal overdose.");



    }
}
