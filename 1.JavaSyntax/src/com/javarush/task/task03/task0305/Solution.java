package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.add(Calendar.DAY_OF_YEAR, -1);
        DateFormat df = new SimpleDateFormat("MMMM dd yyy", Locale.ENGLISH);
        System.out.println(df.format(c.getTime()).toUpperCase());
    }
}
