package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        Integer num;
        List<Integer> array = new ArrayList<>();
        while ((num = Integer.parseInt(reader.readLine())) != null) {
            if (num % 2 == 0) array.add(num);
        }
        reader.close();
        Collections.sort(array);
        for (Integer i:array) {System.out.println(i);}
    }
}
