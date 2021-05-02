package String_practice2;

public class SMSParts {
    public static void main(String[] args) {
        String format = "<james bound>_from number:[202-123-3456]_+ message:{I love " +
                "programing and problem solving}";

        int actualNumber = format.indexOf("[");
        int actualNumber1 = format.indexOf("]");

        int actualSender = format.indexOf("<");
        int actualSender1 = format.indexOf(">");

        int actualMessage = format.indexOf("{");
        int actualMessage1 = format.indexOf("}");

        System.out.println("Sender: " + format.substring(actualSender +1 , actualSender1));
        System.out.println("Number: " + format.substring(actualNumber +1  , actualNumber1) );
        System.out.println("Message: " + format.substring(actualMessage+1 , actualMessage1));






    }
}
