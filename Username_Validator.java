import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     * first we need to specify that the username starts with alphabet so we use
     * ^[a-zA-Z]
     * then we use \\w to specify that the rest of the string contains alphanumberic
     * characters. ( \w represents [a-zA-Z_0-9])
     * {7,29} checks the length of the string is between 7 to 29, remember first
     * character is considered already in step 1.
     * $ represents the end of the string
     */

    public static final String regularExpression = "^[A-Za-z]\\w{7,29}$";
}

public class Username_Validator {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}