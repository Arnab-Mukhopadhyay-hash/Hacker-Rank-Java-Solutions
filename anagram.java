import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        /*
         * First we convert both the strings to same case (I have converted into lower
         * case, but uppercase is also acceptable)
         * Then compare the length of the strings if the lengths are different then its
         * not an anagram, else we need to check further.
         * Next, we have initialized an empty string to keep the letters that we have
         * already counted.
         * We loop through the characters of string 1, and atfirst check if character
         * has already been visited or not.
         * if the character is visited then we continue to the next loop without further
         * checking, but if the character is not visited then we have to do further
         * checkings.
         * Next we add the character to the temporary string, and count the number of
         * occurrences of the character in both the input strings. If the number of
         * occurrences are same then we move on to checking the next character, else we
         * break there only.
         */
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length())
            return false;
        else {
            String s = "";
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (s.indexOf(c) >= 0)
                    continue;
                else {
                    s = s + c;
                    int count_a = 0;
                    int count_b = 0;
                    for (int j = 0; j < b.length(); j++) {
                        if (b.charAt(j) == c)
                            count_b++;
                        if (a.charAt(j) == c)
                            count_a++;
                    }
                    if (count_a == count_b)
                        continue;
                    else
                        return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}