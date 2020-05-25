package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] a = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        int ch = 0, nech = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 > 0) nech += a[i];
            else ch += a[i];
        }
        if (ch > nech) System.out.println("В домах с четными номерами проживает больше жителей." );
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
