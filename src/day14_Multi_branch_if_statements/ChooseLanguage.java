package day14_Multi_branch_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("select language:");
        int selection = scan.nextInt();

        if (selection == 1){
            System.out.println("hello, thanks for your call");
        }else if(selection == 2) {
            System.out.println("HOla, gracias para llamar");
        }else if (selection == 3 ){
            System.out.println("merhaba, aradigiz icin tesekkurler");
        }else if (selection == 4){
            System.out.println("perivet, spaasibo za vash zvonok");
        }else  if (selection == 5){
            System.out.println("merci, pour voter appel");
        }else {
            System.out.println("lets tslk java and english, hello");
        }
    }
}
