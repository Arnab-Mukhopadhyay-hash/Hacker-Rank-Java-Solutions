import java.util.Scanner;

public class diff_inputs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double d = scan.nextDouble();
        // If you use the nextLine() method immediately following the nextInt() method,
        // recall that nextInt() reads integer tokens; because of this, the last newline
        // character for that line of integer input is still queued in the input buffer
        // and the next nextLine() will be reading the remainder of the integer line
        // (which is empty).
        // to avoid the empty string we first read the newline character from buffer
        // input and then the string is taken as input
        scan.nextLine();
        String s = scan.nextLine();
        // String s = bf.readLine();
        scan.close();

        System.out.print("String: " + s + "\nDouble: " + d + "\nInt: " + n + "\n");
    }
}
