package study_while_murdil_is_gone;

public class customeMethodTest {
    public static void main(String[] args) {
        System.out.println(customMethodUtils.sum(10, 15));
        String a = "jlafsdk" ;
        customMethodUtils.CheckIfEmptyOrNull(a);
        stop();
    }

    public static void go(){
        System.out.println("go");
    }public static void dontStop(){
        go();
        System.out.println("keep going");
    }public static void stop(){
        dontStop();
        System.out.println("stop");
    }






}
