package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar calendarDate = Calendar.getInstance();
        calendarDate.setTime(dateFormat.parse(date));
//        if (calendarDate.get(Calendar.DAY_OF_YEAR)%2 == 0){
//            return false;
//        }
//        return true;
        return (calendarDate.get(Calendar.DAY_OF_YEAR)%2 != 0);

    }
}
