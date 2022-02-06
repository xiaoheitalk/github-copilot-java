package com.example.github.copilot.utils;

public class CalendarUtils {

    public static String getDate(long time) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new java.util.Date(time));
    }

    public static String getTime(long time) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
        return sdf.format(new java.util.Date(time));
    }

    int  calculateDaysBetweenDates(long startDate, long endDate) {
        long different = endDate - startDate;
        long secondsInMilli = 1000;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;
        long daysInMilli = hoursInMilli * 24;

        long elapsedDays = different / daysInMilli;
        return (int) elapsedDays;
    }


}
