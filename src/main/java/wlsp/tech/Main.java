package wlsp.tech;

public class Main {
    static int MIND_LENGTH = 8;

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
        return password.length() > MIND_LENGTH;
    }
}