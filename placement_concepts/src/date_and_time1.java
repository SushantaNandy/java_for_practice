import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class date_and_time1 {
    public static void main(String[] args) {
        //Java.time ->package for date and time in java from java 8 onward.
        //How java store the date?
        //Date is stored in the form of long number since 1st Janauary 1970 and that too in millisecond.
        // for years 1900 is considered as base years.
        System.out.println(System.currentTimeMillis());

        //DATE class
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        System.out.println(d.getYear());

        //CALENDER class->It is an abstract class we cant create an object of this class.
        //so if we have to use have one static method
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType()); // which calend we are using
        System.out.println(c.getTimeZone());  //give our location
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ " "+c.get(Calendar.MINUTE)); //24 hrs timing

        //geogrian calender class is a sub class of clender.
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));

        //Timezone
        //to get all available timezones
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        //Java.time() API
        LocalDate date=LocalDate.now();  // These are immutable
        System.out.println(date);

        LocalTime time=LocalTime.now();
        System.out.println(time);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        //Date-time formatter
        //when we want to print the date time in our own way we use formatter object.
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy --E"); //this is the formate
        //--E is to get day of the week

        String mydate=dt.format(df); //using date string using date time formatter
        System.out.println(mydate);


    }
}
