package wlsp.tech;

//import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    //public static String EXAMPLE_PW_8_CHAR = "MIN_EIGHTH_CHARACTERS";
    //static Matcher matcher = MIN_LENGTH_REGEX.matcher(EXAMPLE_PW_8_CHAR);

    //CASES
    static Pattern MIN_LENGTH_REGEX = Pattern.compile(".{8,}$");
    static Pattern MIN_LENGTH_REGEX_NO_WHITESPACE_REGEX = Pattern.compile("^(\\S{8,})$");
    static Pattern HAS_AT_LEAST_ONE_NUMBER_REGEX = Pattern.compile(".*[0-9].*");
    static Pattern IS_ONLY_NUMBER_REGEX = Pattern.compile("^[0-9]+$");
    static Pattern HAS_LOWERCASE_AND_UPPERCASE_REGEX = Pattern.compile("(?=.*[a-z])(?=.*[A-Z]).*");
    static Pattern HAS_AT_LEAST_ONE_SPECIAL_CHARACTER_REGEX = Pattern.compile(".*[#!?@$%^&*-].*");
    static String[] FORBIDDEN_PASSWORDS = {"Password123!", "123Password", "Abc123", "123ABc"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please go ahead, enter a password...");
        String password = sc.nextLine();
        sc.close();

        validatePassword(password);
    }

    //Password should have at least 8 Characters
    public static boolean minLength(String password) {
        boolean isValid = MIN_LENGTH_REGEX.matcher(password).matches();

        if (!isValid) {
            System.out.println("Password has not been minimum length!");
        }

        return isValid;
    }

    //Password should not contain whitespace
    public static boolean minLengthWithOutWhitespace(String password) {

        boolean isValid = MIN_LENGTH_REGEX_NO_WHITESPACE_REGEX.matcher(password).matches();

        if (!isValid) {
            System.out.println("Whitespace is not allowed!");
        }

        return isValid;
    }

    //Password should have at least one number
    public static boolean hasNumber(String password) {
        boolean isValid = HAS_AT_LEAST_ONE_NUMBER_REGEX.matcher(password).matches();
        if (!isValid) {
            System.out.println("At least one number is required!");
        }
        return isValid;
    }

    //Password should NOT be only NUMBERS
    public static boolean isOnlyNumbers(String password) {
        boolean isOnlyNumbers = IS_ONLY_NUMBER_REGEX.matcher(password).matches();

        if (isOnlyNumbers) {
            System.out.println("❌ Password cannot be only numbers!");
            return false;
        }

        return true;
    }

    //Password should have at least one upper and one lower case letter
    public static boolean hasLowercaseAndUppercase(String password) {
        boolean isValid = HAS_LOWERCASE_AND_UPPERCASE_REGEX.matcher(password).matches();

        if (!isValid) {
            System.out.println("At least one uppercase and one lowercase character is required!");
        }

        return isValid;
    }

    //Password should have at least one special character
    public static boolean hasAtLeastOneSpecialCharacter(String password) {
        boolean isValid = HAS_AT_LEAST_ONE_SPECIAL_CHARACTER_REGEX.matcher(password).matches();

        if (!isValid) {
            System.out.println("❌ At least one special character is required!");
        }

        return isValid;
    }


    //Password should NOT be one of those @FORBIDDEN_PASSWORDS
    public static boolean isNotFrequentlyUse(String password) {
        for (String pwd: FORBIDDEN_PASSWORDS) {
            if (pwd.equals(password)) {
                System.out.println("Nice try diddy - not that one! That's to easy, try again!");
                return false;
            }
        }
        return true;
    }

    public static void validatePassword(String password) {
        boolean validated  = minLength(password)
                && minLengthWithOutWhitespace(password)
                && hasNumber(password)
                && isOnlyNumbers(password)
                && hasLowercaseAndUppercase(password)
                && hasAtLeastOneSpecialCharacter(password)
                && isOnlyNumbers(password)
                && isNotFrequentlyUse(password);

        if (validated) {
            System.out.println("Password has been validated!");
        }


    }

}