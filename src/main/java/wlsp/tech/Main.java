package wlsp.tech;

//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //public static String EXAMPLE_PW_8_CHAR = "MIN_EIGHTH_CHARACTERS";
    //static Matcher matcher = MIN_LENGTH_REGEX.matcher(EXAMPLE_PW_8_CHAR);


    //CASES:
    static Pattern MIN_LENGTH_REGEX = Pattern.compile(".{8,}$");
    static Pattern MIN_LENGTH_REGEX_NO_WHITESPACE_REGEX = Pattern.compile("^(\\S{8,})$");


   /*@TODO to implement when all methods are ready to use
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password");
    String password = sc.nextLine();
        sc.close();
    */

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    //Password should have at least 8 Characters
    public static boolean minLength(String password) {
        return MIN_LENGTH_REGEX.matcher(password).matches();
    }

    //Password should not contain whitespace
    public static boolean minLengthWithOutWhitespace(String password) {
        return MIN_LENGTH_REGEX_NO_WHITESPACE_REGEX.matcher(password).matches();
    }

}