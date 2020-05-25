package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream1 = new FileOutputStream(bufferedReader.readLine(), true);
        FileInputStream fileInputStream2 = new FileInputStream(bufferedReader.readLine());
        FileInputStream fileInputStream3 = new FileInputStream(bufferedReader.readLine());
        bufferedReader.close();

        while (fileInputStream2.available() > 0) {
            int nextByte = fileInputStream2.read();
            fileOutputStream1.write(nextByte);
        }

        while (fileInputStream3.available() > 0) {
            int nextByte = fileInputStream3.read();
            fileOutputStream1.write(nextByte);
        }

        fileOutputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
    }
}
