package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

import java.time.Duration;
import java.time.LocalTime;

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        //System.out.println(secondsAfter15);
        LocalTime time1 = LocalTime.of(15,00);
        LocalTime time2 = LocalTime.of(15, 30);
        Duration duration = Duration.between(time1, time2);
        System.out.println(duration.getSeconds());
    }
}