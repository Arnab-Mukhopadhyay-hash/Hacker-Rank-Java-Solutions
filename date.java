import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.text.Format;

public class date {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance(); // creating a calendar instance
        cal.set(year, month - 1, day); // setting the date to the input date, initially it was the current date
        Format f = new SimpleDateFormat("EEEE"); // to format the date into the day [Saturday, sunday, monday, etc.]
        return f.format(cal.getTime()).toUpperCase(); // .getTime() Returns a Date object representing this Calendar's
                                                      // time value (millisecond offset from the Epoch"). format method
                                                      // of the f object is used to convert it into the desired output.
    }

    public static String findDay2(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        // creating a DateformatSymbols object which consists of the Weekdays, it's an
        // array consisting of the names of the weekdays.
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar cal = Calendar.getInstance();
        // another way to set the calendar date
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        // cal.get(Calendar.DAY_OF_WEEK) returns an integer for the weekdays
        // 0 is for sunday and 6 is for saturday, likewise 1 for monday, 2 for tuesday
        // and so on.
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        // we access the name of the day with the index number (day of week)
        String str = dayNames[dayofweek];
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        String s = findDay(month, day, year);
        System.out.println(s);
        scan.close();
    }
}
