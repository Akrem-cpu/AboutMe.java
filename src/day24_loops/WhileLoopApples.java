package day24_loops;

public class WhileLoopApples {
    public static void main(String[] args) throws InterruptedException {
        int apples = 1;
        while (apples <= 10){
            System.out.println("eating apples ");
            apples++;
        }


        int unreadMessage = 10;
        System.out.println("i have total " + unreadMessage + " unread SMS");

        while (unreadMessage >= 0){
            System.out.println("reading SMS" + unreadMessage--);
            Thread.sleep(1000);

        }
        System.out.println("no more unread SMS messages ");



    }
}
