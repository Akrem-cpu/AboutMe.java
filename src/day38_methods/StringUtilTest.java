package day38_methods;
import static day38_methods.StringUtils.*;

public class StringUtilTest {

    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName));{
            System.out.println("FAIL: username cannot be nul or epmty");
        }

        System.out.println(isPalindrome("kayak"));
       System.out.println("isPalindraom (CyberTek) = " + isPalindrome("CyberTek"));
        boolean a = isPalindrome("mom");
        System.out.println(a);

        System.out.println(reverse("Akrem"));
        String word = "java";
         String revWord  =  reverse(word);
        System.out.println(revWord);



    }

}
