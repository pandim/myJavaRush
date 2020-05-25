package com.javarush.task.task08.task0816;

//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap(){
//        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
//        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        for (int i = 0; i < 10; i++) {
//            LocalDate dater = LocalDate.of(2011, i, 21);
            Date date = new Date(25 - 1 - 2011);
            date.setMonth(i);
            map.put("Сталлоне" + i, date);
        }
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
//        Iterator<Map.Entry<String, Date>> entryIterator = map.entrySet().iterator();
//        while (entryIterator.hasNext()) {
//            Map.Entry<String, Date> entry = entryIterator.next();
//            int t = entry.getValue().getMonth();
//            if ((entry.getValue().getMonth() > 4) & (entry.getValue().getMonth() < 8)) entryIterator.remove();
            map.entrySet().removeIf(entry -> ((entry.getValue().getMonth() > 4) & (entry.getValue().getMonth() < 8)));
        }

    public static void main(String[] args) {
//        Map<String, Date> map;
//        map = createMap();
//        removeAllSummerPeople(map);
    }
}
