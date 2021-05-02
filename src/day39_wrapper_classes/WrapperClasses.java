package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(num);
        Integer n = new Integer(500);
        System.out.println(n.equals(500));
        // Different way of declaring wrapper classes.



        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;

        Short sh1 = new Short((short) 40);
        Integer i1 = new Integer(100);

        Long l1 = new Long(300l);
        Long l2 = 3455l;

        Float fl1 = new Float(5.2f);
        Float fl2 = 45.3f;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Character ch1 = new Character('q');
        Character ch2 = 'v';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;







    }
}
