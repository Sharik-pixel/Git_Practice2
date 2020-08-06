package day_11_string_comparison_logical;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "cbtuser";
        String password = "abc123";

        if (userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")) {
            System.out.println("Login Successful. Welcome!");

        } else if (userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")) {
            System.out.println("Invalid password! Try again.");

        } else if (!userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")) {
            System.out.println("InvaliduserName! Try again.");

        } else if (!userName.equalsIgnoreCase("cbtuser") && !password.equals("abc123")) {
            System.out.println("\"Invalid userName and password! Try again");
        }
    }
}