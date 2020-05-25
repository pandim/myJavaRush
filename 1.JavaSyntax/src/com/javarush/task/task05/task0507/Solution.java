package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float alltemp = 0;
        int sch = 0;
        while (true) {
            int temp = Integer.parseInt(reader.readLine());
        if (temp == -1) break;
        alltemp += temp;
        sch++;
        }
        System.out.println(alltemp/sch);
    }
}

