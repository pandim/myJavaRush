package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int m = Integer.parseInt(reader.readLine());
            sum += m;
            if (m== -1) break;
        }
        System.out.println(sum);

    }
}
