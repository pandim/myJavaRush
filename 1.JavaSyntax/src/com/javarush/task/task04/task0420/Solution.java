package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x;
        if (b>a){ x = a; a = b; b = x;}
        if (c>b){ x = b; b = c; c = x;}
        if (b>a){ x = a; a = b; b = x;}
        System.out.println(a + " " + b + " " +c);

    }


}
