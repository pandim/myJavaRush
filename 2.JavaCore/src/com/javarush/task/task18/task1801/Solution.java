package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        int max = 0, data;
        if (inputStream.available() > 0) max = inputStream.read();
        while (inputStream.available() > 0) {
            if ((data = inputStream.read()) > max) max = data;
        }
        inputStream.close();
        System.out.println((byte) max);
    }
}
