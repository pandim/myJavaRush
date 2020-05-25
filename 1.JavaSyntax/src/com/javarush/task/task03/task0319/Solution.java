package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sum = reader.readLine();
        String sAge = reader.readLine();
        int nSum = Integer.parseInt(sum);
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " получает " + nSum +" через " + nAge + " лет.");

    }
}
