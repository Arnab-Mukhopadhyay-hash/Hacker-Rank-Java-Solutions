import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================");
        for (int i = 0; i < 3; i++) {
            String s1 = scan.next();
            int n1 = scan.nextInt();
            // printf function works same as of C printf, - is used to add spaces after the
            // input string, 15 is the total number of characters printed in string, and 03
            // is to print 3 digits only if less than 3 digits then 0 is added at the
            // beginning
            System.out.printf("%-15s%03d\n", s1, n1);
        }
        scan.close();
        System.out.println("====================");
    }

}
