package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    static int min(int x, int y){
        return Math.min(x, y);
    }
    static long min(long x, long y){
        return Math.min(x, y);
    }
    static double  min(double  x, double  y){if (x<y) return x; else return y;}
}
