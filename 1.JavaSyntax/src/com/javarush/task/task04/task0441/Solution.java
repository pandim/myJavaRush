package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d;
        if (a>b) {d=a;a=b;b=d;}
        if (b>c) {d=b;b=c;c=d;}
        if (a>b) {d=a;a=b;b=d;}
        System.out.println(b);
        }
    }

