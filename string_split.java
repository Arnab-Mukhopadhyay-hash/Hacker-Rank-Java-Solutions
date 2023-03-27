import java.util.Scanner;
import java.util.regex.*;

public class string_split {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        scan.close();

        if (str.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] str_arr = str.split("[\\s+!,.'@?_]+");
        System.out.println(str_arr.length);
        for (String i : str_arr) {
            System.out.println(i);
        }

    }
}