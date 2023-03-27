import java.util.Scanner;
import java.util.regex.*;

public class string_split {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim(); // we take the whole string as input and trim the spaces at the end and
                                             // starting.
        scan.close();

        if (str.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] str_arr = str.split("[\\s+!,.'@?_]+"); // this will split the string at ! , . ? ' _ @ and at blank
                                                        // spaces, and make an array of strings.
        System.out.println(str_arr.length);
        for (String i : str_arr) {
            System.out.println(i);
        }

    }
}