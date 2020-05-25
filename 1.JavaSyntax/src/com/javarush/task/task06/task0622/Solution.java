package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Integer[] mas = new Integer[5];
        int[] mas = new int[5];
        for (int i = 0; i < 5; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
//        Arrays.sort(mas, Collections.reverseOrder()); // по убыванию, но нужны объекты
        Arrays.sort(mas); // по возрастанию
        for (int i = 0; i <5 ; i++) {
            System.out.println(mas[i]);

        }
    }
}
