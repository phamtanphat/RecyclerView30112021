package com.example.recyclerview30112021;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utils {

    public static long getTime(int hour , int minute , int second){
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),hour,minute,second);
        return calendar.getTimeInMillis();
    }
}
