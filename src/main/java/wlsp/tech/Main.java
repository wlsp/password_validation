package wlsp.tech;

//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //public static String EXAMPLE_PW_8_CHAR = "MIN_EIGHTH_CHARACTERS";

    static Pattern MIN_LENGTH_REGEX = Pattern.compile(".{8,}$");
    //static Matcher matcher = MIN_LENGTH_REGEX.matcher(EXAMPLE_PW_8_CHAR);

   /*@TODO to implement when all methods are ready to use
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password");
    String password = sc.nextLine();
        sc.close();
    */

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static boolean eighthCharactersOrMore(String password) {
        return MIN_LENGTH_REGEX.matcher(password).matches();
    }

}