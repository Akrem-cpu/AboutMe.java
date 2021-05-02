package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //car list
        List<String> myCars = new ArrayList<String>();
        myCars.add("Tesla");
        myCars.add("Toyota");
        myCars.add("ford");
        myCars.add("Mazda");
        myCars.add("Moskvich");
        myCars.add(0,"Jeep");
        myCars.add(1,"Lada");
        myCars.add(2, "Yugo");
        System.out.println(myCars);
        String AllCarsIn1st = myCars.toString();
        System.out.println(AllCarsIn1st.substring(1,AllCarsIn1st.length()-2));

        myCars.set(0,"Lamborghini");
        System.out.println(myCars);
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        myCars.set(myCars.indexOf("ford"),"jiguli");
        myCars.set(myCars.indexOf("Lada"), "Akrem");
        System.out.println(myCars);


        if ( myCars.contains("Akrem")){
            System.out.println( myCars.set(myCars.indexOf("Akrem"),"Lada"));
        }else {
            System.out.println("Akrem is not found");
        }
        System.out.println(myCars);

        for (int i = 0; i < myCars.size() ; i++) {
            if (myCars.get(i).equals("Lamborghini")){
                myCars.set(i, "prius");
            }
        }

        System.out.println(myCars);

    }
}
