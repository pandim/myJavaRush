package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = reader.readLine();
        String fileNameOut1 = reader.readLine();
        String fileNameOut2 = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileNameIn);
        FileOutputStream outputStream1 = new FileOutputStream(fileNameOut1);
        FileOutputStream outputStream2 = new FileOutputStream(fileNameOut2);

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            int k = count / 2;
            if (count % 2 == 0) {
                outputStream1.write(Arrays.copyOf(buffer, k));
                outputStream2.write(Arrays.copyOfRange(buffer, k, count));
            } else {
                outputStream1.write(Arrays.copyOf(buffer, k + 1));
                outputStream2.write(Arrays.copyOfRange(buffer, k + 1, count));
            }

        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
