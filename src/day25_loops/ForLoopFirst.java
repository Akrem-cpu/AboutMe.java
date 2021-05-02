package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;

        for (i = 0 ; i <=5 ; i++){
            System.out.println("java is fun");
            Thread.sleep(100);

        }
        for(i = 1; i<=10 ; i++){
            System.out.print(" "+i);
        }


    }
}
