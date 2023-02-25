import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        // making a scanner object to take inputs
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        // applying conditions for desired output
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }

    }
}
