package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = Integer.parseInt(reader.readLine());
        if (counter > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            while (counter > 1) {
                int num = Integer.parseInt(reader.readLine());
                if (num > maximum) maximum = num;
                counter--;
            }
            System.out.println(maximum);
        }


    }
}
