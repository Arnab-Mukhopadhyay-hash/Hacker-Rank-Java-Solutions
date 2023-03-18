import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();
        scan.close();
        // we can access any substring in java using the substring method, there are two
        // implements of this method
        // 1. string.substring(start_index);
        // 2. string.substring(start_index, end_index); This will go on till end_index -
        // 1;
        System.out.println(S.substring(start, end));
    }
}