package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();

        SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH);
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        Date date1 = oldDateFormat.parse(date);
        System.out.println(newDateFormat.format(date1).toUpperCase());
    }
}
