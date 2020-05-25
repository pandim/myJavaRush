package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int[] arr = new int[255];
        while (fis.available() > 0) {
            int nextByte = fis.read();
            arr[nextByte]++;
        }
        for (int i = 0; i < 255; i++) {
            if (arr[i] > 0) System.out.println((char) i + " " + arr[i]);
        }
        fis.close();
    }
}
