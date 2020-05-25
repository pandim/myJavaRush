package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = reader.readLine();
        String fileNameOut = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileNameIn);
        FileOutputStream outputStream = new FileOutputStream(fileNameOut);
        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            for (int i = count - 1; i >= 0; i--) {
                outputStream.write(buffer[i]);
            }
        }
        inputStream.close();
        outputStream.close();
    }
}
