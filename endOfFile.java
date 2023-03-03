import java.util.Scanner;

public class endOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1; // this is just to print the index of the line
        while (scan.hasNext()) { // scan.hasNext() passes true if next input is available and false if next input
                                 // is not available.
            String s = scan.nextLine(); // take the line as input
            System.out.println(i + " " + s); // print the index and the line
            i++; // update the index
        }
        scan.close();
    }
}
