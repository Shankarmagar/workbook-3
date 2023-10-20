package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        LocalDateTime currentTime = LocalDateTime.now(); //
        DateTimeFormatter formattingDate = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //formatting or changing to our output based on String passed as a parameter

        String fullDate = currentTime.format(formattingDate);

        DateTimeFormatter updatedFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String newFormattedDate = currentTime.format(updatedFormat);

        DateTimeFormatter monthInWords = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String monInWord = currentTime.format(monthInWords);


        System.out.println(fullDate);
        System.out.println(newFormattedDate);
        System.out.println(monInWord);


        //Showing in GMT format
        TimeZone t = TimeZone.getTimeZone("GMT");

        Date currentDateForGMT = new Date();
        t = TimeZone.getTimeZone("GMT");

        SimpleDateFormat GMTFrmt= new SimpleDateFormat("EEEE, MMM dd, yyyy hh:mm");
        GMTFrmt.setTimeZone(t);
        System.out.println(GMTFrmt.format(currentDateForGMT));

        //Bonus Parts
        //DateTimeFormatter bonusFormat = DateTimeFormatter.ofPattern("");

        //Bonus parts My local is New York so getting New York time zone
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");

        Date currentDate = new Date();
        SimpleDateFormat localFormat = new SimpleDateFormat("hh:mm 'on' dd-MMM-yyyy");
        System.out.println(localFormat.format(currentDate));

    }
}