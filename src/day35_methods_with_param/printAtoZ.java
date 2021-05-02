package day35_methods_with_param;

public class printAtoZ {
    public static void main(String[] args) {
      alphabet();
      displayUSFlag();
    }

    public static void alphabet() {
        String atoZ = "";
        for (char i = 'A'; i <= 'Z' ; i++) {
            atoZ +=i +" ";

        }
        System.out.println(atoZ.trim());
    }




    public static void displayUSFlag() {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
