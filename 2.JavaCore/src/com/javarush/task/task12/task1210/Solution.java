package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    static int max(int x, int y){
        return Math.max(x, y);
    }
    static long max(long x, long y){
        return Math.max(x, y);
    }
    static double  max(double  x, double  y){if (x>y) return x; else return y;}
}
