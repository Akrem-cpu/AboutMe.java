package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars = " + cars);
        cars += 7;
        System.out.println("cars = " + cars);

        // 6 cars left the parking lot

        cars -= 6;
        System.out.println("cars = " + cars);

        int electricCar = 13;
        cars += electricCar -1;
        System.out.println("cars = " + cars);

        String word = "java";
        System.out.println("word = " + word);
        word = word +" programing";
        System.out.println(word);

        word +=" is fun";
        System.out.println("word = " + word);
        String selenium = " But Selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);
        word += 1234;
        System.out.println("word = " + word);
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);


        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee *= 0.5 ;
        System.out.println("parkingFee = " + parkingFee);

        }
    }

