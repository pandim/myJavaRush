package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        List<Integer> list = new ArrayList<>();
        int k;
        while (inputStream.available() > 0) {
            k = inputStream.read();
            if (list.indexOf(k) < 0)
                list.add(k);
        }
        inputStream.close();
        Collections.sort(list);
        for (Integer b : list) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
