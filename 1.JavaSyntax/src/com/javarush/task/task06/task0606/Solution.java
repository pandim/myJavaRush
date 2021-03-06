package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;//четное
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        while (num > 0) {
            if ((num - ((int) num / 10 * 10)) % 2 == 0) even++;
            else odd++;
            num = num / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
