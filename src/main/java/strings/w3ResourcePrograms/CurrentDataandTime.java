package strings.w3ResourcePrograms;

import java.util.Calendar;


public class CurrentDataandTime {

    /*
    The following characters can be used for date and time formatting:

            H - 24-hour format of an hour (00 to 23)
            I - 12-hour format of an hour (01 to 12)
            k - 24-hour format of an hour (0 to 23)
            l (lowercase 'L') - 12-hour format of an hour (1 to 12)
            M - Minutes with leading zeros (00 to 59)
            S - Seconds with leading zeros (00 to 59) (The value 60 may occur for leap seconds)
            L - Milliseconds with leading zeroes (000 to 999)
            N - Nanoseconds with leading zeroes (000000000 to 999999999)
            p - "am", "pm", "AM" or "PM" to indicate morning or afternoon
            z - Difference to Greenwich time (Example: -0800)
            Z - Timezone abbreviations (Examples: EST, MDT)
            s - The seconds since the Unix Epoch (January 1 1970 00:00:00 GMT)
            Q - The milliseconds since the Unix Epoch (January 1 1970 00:00:00 GMT)
            B - A full textual representation of a month (January through December)
            b or h - A short textual representation of a month (three letters)
            A - A full textual representation of a day (Example: Monday)
            a - A short textual representation of a day (Example: Mon)
            C - The first two digits of the year (For 1970, "19" would be shown)
            Y - A four digit representation of a year
            y - A two digit representation of a year
            j - The day of the year with leading zeroes (001 to 366)
            m - A numeric representation of a month (01 to 12)
            d - The day of the month (01 to 31)
            e - The day of the month without leading zeros (1 to 31)
            R - The time in 24-hour format (Example: 21:30)
            T - The time in 24-hour format with seconds (Example: 21:30:02)
            r - The time in 12-hour format with seconds (Example: 09:30:02 PM) ("AM" and "PM" are always uppercase)
            D - Date representation as month/day/year (Example: 12/17/23)
            F - Date representation as year-month-day (Example: 2023-12-17)
            c - Full date and time (Example: Thu Mar 28 10:51:00 EDT 2024)

    */

    public static void main(String[] args) {
        Calendar newCal = Calendar.getInstance();
        System.out.println("Current Data and Time is: ");
        System.out.format("Date is : %tA, %tB, %tY%n",  newCal,newCal, newCal);
        System.out.format("Time is : %tH:%tM:%tS%n",  newCal,newCal, newCal);
    }

}
