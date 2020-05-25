package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        FileInputStream stream;
        try {
            while (true) {
                file = reader.readLine();
                try {
                    stream = new FileInputStream(file);
                } catch (FileNotFoundException e) {
                    System.out.println(file);
                    break;
                }
                stream.close();
            }
        } catch (IOException e) {}
    }
}

