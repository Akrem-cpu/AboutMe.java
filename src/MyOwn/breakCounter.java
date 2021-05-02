package MyOwn;

public class breakCounter {
    public static void main(String[] args) throws InterruptedException {
          int min = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("min = " + min);
            min++;
            for (int j = 0; j <= 60 ; j++) {
                System.out.print(j);
                Thread.sleep(1);



            }
            System.out.print(" one min ");
        }
        System.out.println("go bac to class.");


    }
}
