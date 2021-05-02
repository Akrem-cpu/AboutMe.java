package study_while_murdil_is_gone;

import java.util.Iterator;
import java.util.LinkedList;

public class wrapperClasses {
    public static void main(String[] args) {
        String a = "5" ;
       int changeToNumber = Integer.parseInt(a);
        System.out.println(changeToNumber + 5);
        LinkedList<Integer> linky = new LinkedList<Integer>();
        linky.add(66);
        linky.add(6);
        linky.add(987);
        Iterator it = linky.iterator();



    }


}
