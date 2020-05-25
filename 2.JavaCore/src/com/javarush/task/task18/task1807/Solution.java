package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        int counter = 0;
        while (inputStream.available() > 0) {
            if (inputStream.read() == 44) counter++;
        }
        inputStream.close();
        System.out.println(counter);

    }
}
