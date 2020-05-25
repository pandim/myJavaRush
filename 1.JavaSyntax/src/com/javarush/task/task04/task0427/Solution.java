package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if ((a > 0) & (a<1000)){
            if (a%2 == 0 ) System.out.print("четное ");
            else System.out.print("нечетное ");
            if (a > 99) System.out.println("трехзначное число");
            else if (a> 9) System.out.println("двузначное число");
            else System.out.println("однозначное число");
        }

    }
}
