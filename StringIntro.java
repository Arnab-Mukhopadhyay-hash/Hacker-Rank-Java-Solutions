import java.util.*;

public class StringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        /* Code goes here */
        // Use string.length() method to find the lengths of the strings.
        System.out.println(A.length() + B.length());
        // string1.compareTo(string2) is used to compare string1 and string2
        // lexicographical
        // user defined function is also available at
        // https://coderolls.com/compare-two-strings-lexicographically-in-java/
        int f = A.compareTo(B);
        if (f <= 0)
            System.out.println("No");
        else if (f > 0)
            System.out.println("Yes");

        // the Character.toUpperCase(string.charAt(index)) will capitalize and return
        // only one character of the string at that index, so we need to add the rest of
        // the string as substring. string.substring(beginning_index) helps to add the
        // remaining substring.
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " "
                + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}
