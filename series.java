import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        while (l-- != 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            // do not close the scanner class here, because then the scanning for next loop
            // would not happen.

            // for output, we keep a common variable current to store the current term and
            // then we add (2^n-i)*b to the current term and get the next term.
            int current = a;
            for (int i = 0; i < n; i++) {
                current += Math.pow(2, i) * b;
                System.out.printf("%d, ", current);
            }
            System.out.printf("\n");
        }
        scan.close(); // close the scanner class here
    }
}