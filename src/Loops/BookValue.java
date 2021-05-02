package Loops;
import  java.util.Arrays;

public class BookValue {
    public static void main(String[] args) {
        int bookChapter = 1;
        String book = "Java textbook chapter By Murodil. Chapter 1 datatypes and variables. Chapter 2 conditional statements. chapter 3 String manipulation. Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.";
        //              0123                  0123456

        for (int i = 0; i < book.length() ; i++) {
                  if (book.charAt(i) <= '9' && book.charAt(i) >= '1'){
                      bookChapter+=1;
                  }
        }
        System.out.println(bookChapter + " chapters -> value of the book: " + (bookChapter* 10));


       String word ="java is fun";
       char[] word2 = word.toCharArray();
        System.out.println(Arrays.toString(word2));






    }
}
