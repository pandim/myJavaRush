package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        int counter = 0, spaceCounter = 0;
        int symbol = reader.read();
        while (symbol != -1) {
            if (symbol == ' ') spaceCounter++;
            counter++;
            symbol = reader.read();
        }
        reader.close();

        System.out.printf("%.2f", (float)spaceCounter/counter*100);
    }
}
