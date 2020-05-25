package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis1 = new FileInputStream(fileName);
        FileInputStream fis2 = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(fileName);
        byte[] buf1 = new byte[fis1.available()];
        byte[] buf2 = new byte[fis2.available()];
        while (fis1.available() > 0) {
            int count = fis1.read(buf1);
        }
        while (fis2.available() > 0) {
            int count = fis2.read(buf2);
        }

        if (buf2.length > 0) fos.write(buf2);
        if (buf1.length > 0) fos.write(buf1);
        fis1.close();
        fis2.close();
        fos.close();
    }
}
