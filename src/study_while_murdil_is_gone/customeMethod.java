package study_while_murdil_is_gone;

public class customeMethod {
    public static void main(String[] args) {
   method1(100);

    }



   public static void method1(int a  ){
       System.out.print(a+ " ");
       a--;
       if ( a >=0){
           method1(a);
       }

    }



}
