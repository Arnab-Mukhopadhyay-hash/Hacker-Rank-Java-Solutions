import java.util.Scanner;

public class substring_match {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        /* Initializing smallest and largest with the starting substring. */
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        // if string length is 5 and k is 3 then we have to loop till the 3rd last
        // position of the string so , here it is 3 (5-3 + 1 = 3) so length(string) - k
        // +1
        for (int i = 0; i < s.length() - k + 1; i++) {
            // we take each of the substrings present in the string and compare it with the
            // present smallest and present largest.
            String ss = s.substring(i, i + k);
            if (ss.compareTo(smallest) < 0)
                smallest = ss; // if substring smaller than smallest then replace smallest value.
            if (ss.compareTo(largest) > 0)
                largest = ss; // if substring greater than largest then replace largest value.
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}