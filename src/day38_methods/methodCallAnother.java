package day38_methods;

public class methodCallAnother {
    public static void main(String[] args) {

    end();

    }



    public static void start(){

        System.out.println("Start");
    }
    public static void Continue(){

        start();
        System.out.println("continues");
    }
    public static void end(){
        Continue();
        System.out.println("end");
    }



}
