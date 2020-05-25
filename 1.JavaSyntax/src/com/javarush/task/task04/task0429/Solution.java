package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int pol = 0, otr = 0;
        if (a > 0) ++pol;
        else if (a < 0) ++otr;
        if (b > 0) ++pol;
        else if (b < 0) ++otr;
        if (c > 0) ++pol;
        else if (c < 0) ++otr;
        System.out.println("количество отрицательных чисел: " + otr);
        System.out.println("количество положительных чисел: " + pol);
    }
}
