package saim_only;

public class curseChecker {
    public static void main(String[] args) {
        String text = "helle dumb";
        if (text.contains("idiot") || text.contains("dumb") || text.contains("heck")){
            System.out.println("massage not sent");
        }else {
            System.out.println("massage sent ");
        }
    }
}
