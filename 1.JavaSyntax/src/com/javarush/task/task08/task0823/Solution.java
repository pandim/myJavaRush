package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String string = reader.readLine();
//        char[] strAr = string.toCharArray();

        char[] strAr = reader.readLine().toCharArray();
        strAr[0]=Character.toUpperCase(strAr[0]);
        for (int i = 0; i < strAr.length-1; i++) { if (strAr[i] == ' ') strAr[i+1]=Character.toUpperCase(strAr[i+1]);}
        System.out.println(strAr);
     }
}
