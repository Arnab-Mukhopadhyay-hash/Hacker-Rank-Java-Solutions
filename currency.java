import java.util.*;
import java.text.*;

public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // The getCurrencyInstance() method is a built-in method of the
        // java.text.NumberFormat returns a currency format for the current default
        // FORMAT locale. It doesn't accept any instance but there is a method override
        // also which is , getCurrencyInstance(Locale inLocale) which accepts a locale
        // object as a parameter.
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf1.format(payment);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); // since India doesn't have a built
                                                                                     // in Locale so we had to construct
                                                                                     // one
        String india = nf2.format(payment);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf3.format(payment);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf4.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}

// https://www.geeksforgeeks.org/numberformat-getcurrencyinstance-method-in-java-with-examples/
// for referrence