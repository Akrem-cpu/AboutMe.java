package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Esty smoke test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodSpoon();

    }


    public static void openBrowser (){
        System.out.println("Launching Chrome Browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("navigating to http://www.esty.com/");

    }
    public static void searchForWoodSpoon(){
        System.out.println("pass: verify Esty home page is displayed");
        System.out.println("type 'wodden spoon' in search filed and click search");

    }
    public static void  v(){

    }
}
