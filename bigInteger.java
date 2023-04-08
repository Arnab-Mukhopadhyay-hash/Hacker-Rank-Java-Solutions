import java.util.Scanner;

class BigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        BigInteger big_a = new BigInteger(a);
        BigInteger big_b = new BigInteger(b);
        System.out.println(big_a.add(big_b));
        System.out.println(big_a.multiply(big_b));
    }
}