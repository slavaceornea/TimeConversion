package timeconversion;

import java.util.Scanner;

/**
 *
 * @author Slava
 * 
 * Given a time in AM/PM format, convert it to military (24-hour) time.
 *
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
 * 
 * Input Format
 * A single string containing a time in -hour clock format.
 * 
 * Output Format
 * 
 * Convert and print the given time in -hour format, where .
 * 
 * Sample Input
 * 07:05:45PM
 * 
 * Sample Output
 * 19:05:45
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
      
        System.out.println(convertTo24HourFormat(time));
    }
    
    private static String convertTo24HourFormat(String timeIn12HourFormat)
    {
        int hour = Integer.parseInt(timeIn12HourFormat.substring(0, 2));
        String timeOfDay = timeIn12HourFormat.substring(8, 10);
        
        if(timeOfDay.equals("AM"))
        {
            if(hour == 12)
                hour = 0;
        }
        else if(timeOfDay.equals("PM"))
        {
            if(hour != 12)
                hour += 12;
        }
        
        return String.format("%02d%s", hour, timeIn12HourFormat.substring(2, 8));
    }
}
