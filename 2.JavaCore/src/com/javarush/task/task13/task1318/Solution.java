package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        InputStream inputStream = new FileInputStream(name);
        int c;
        while ((c = inputStream.read()) != -1){
            System.out.print((char) c);
        }
        inputStream.close(); //закрываем потоки
    }
}