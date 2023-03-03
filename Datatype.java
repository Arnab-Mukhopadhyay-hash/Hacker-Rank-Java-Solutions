import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- != 0) { // Loop for test cases
            // We use try and catch for exception handling, if our input is larger than long
            // or is string(something not integer) then instead of error we immediatly can
            // show that the input cannot fit into any of the given datatypes.
            try {
                long x = scan.nextLong(); // we are taking long input since it is the largest type of input possible.
                System.out.println(x + " can be fitted in:");
                if (x >= -1 * Math.pow(2, 7) && x <= Math.pow(2, 7) - 1)
                    System.out.println("* byte"); // byte is of 8 bits but here we are using first bit for sign so we
                                                  // need to consider 7 bits
                if (x >= -1 * Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short"); // short if of 16 bits but 1st bit is the sign bit so 15 bits
                if (x >= -1 * Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int"); // int is of 32 bits but 1st bit is the sign bit so 31 bits
                if (x >= -1 * Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long"); // long is of 64 bits but 1st bit is the sign bit so 63 bits.
                // WE HAVE SUBTRACTED 1 FROM THE UPPER RANGE BECAUSE 0 IS CONSIDERED IN THE
                // NEGATIVE RANGE, SO IF WE DON'T SUBTRACT 1 THEN WE WILL END UP COUNTING 0
                // TWICE (ONCE IN THE POSITIVE RANGE AND ONCE IN THE NEGATIVE RANGE)
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}
