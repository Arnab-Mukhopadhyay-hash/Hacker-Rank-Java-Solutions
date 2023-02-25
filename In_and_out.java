import java.util.Scanner;

public class In_and_out {
    public static void main(String[] args) {
        // Creating a scanner object called scan to take input
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.print(a + "\n" + b + "\n" + c);
    }
}
