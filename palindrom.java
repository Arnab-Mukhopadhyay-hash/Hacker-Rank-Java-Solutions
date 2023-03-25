import java.util.Scanner;

public class palindrom {
    /**
     * we simply create a new empty string, loop through the given characters of the
     * given string and concatenate these characters at the start of the new string.
     * Complexity O(|string|);
     */
    public static String rev_str0(String s) {
        String rs = "";
        for (int i = 0; i < s.length(); i++) {
            rs = s.charAt(i) + rs;
        }
        return rs;
    }

    /* Using StringBuilder Method */
    public static String rev_str1(String s) {
        StringBuilder rs = new StringBuilder();
        rs.append(s);
        rs.reverse();
        String rev_str = rs.toString();
        return rev_str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        String reversed_s = rev_str0(s);

        if (s.compareTo(reversed_s) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}