package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        LocalDateTime currentTime = LocalDateTime.now(TimeZone.getTimeZone("GMT").toZoneId()); //
        DateTimeFormatter formattingDate = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //formatting or changing to our output based on String passed as a parameter

        String fullDate = currentTime.format(formattingDate);

        DateTimeFormatter updatedFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String newFormattedDate = currentTime.format(updatedFormat);

        DateTimeFormatter monthInWords = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String monInWord = currentTime.format(monthInWords);

        DateTimeFormatter DayInWeek = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");
        String dayInWeekWithMoninWords = currentTime.format(DayInWeek);

        System.out.println(fullDate);
        System.out.println(newFormattedDate);
        System.out.println(monInWord);
        System.out.println(dayInWeekWithMoninWords);

        //bonus part
        LocalDateTime currentTimeForBonus = LocalDateTime.now(); //
        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("hh:mm 'on' dd-MMM-yyyy");
        System.out.println(currentTimeForBonus.format(frmt));
    }

}