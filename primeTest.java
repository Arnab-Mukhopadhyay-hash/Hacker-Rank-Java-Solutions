
class primeTest {
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String n = read.readLine();
        read.close();
        // integers of length 100, which exceeds the limit of int and long so BigInteger
        // is used. Also we cannot use isProbablePrime method on integers, it works only
        // on BigIntegers.

        // This method accepts a mandatory parameter certainty which is a measure of the
        // uncertainty that is acceptable to the user. This is due to the fact the
        // BigInteger is a very very large number and finding exactly if it is prime is
        // very difficult and expensive. Hence it can be said that this method checks
        // for the prime of this BigInteger based on a threshold value (1 –
        // 1/2certainty).
        BigInteger num = new BigInteger(n);
        if (num.isProbablePrime(1))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}