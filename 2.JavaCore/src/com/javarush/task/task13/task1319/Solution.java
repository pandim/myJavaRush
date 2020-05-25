package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        while (true){
            String string = reader.readLine();
            writer.write(string + "\n");
            if (string.equals("exit")) break;
        }
        reader.close();
        writer.close();
//        System.out.println(new File(".").getAbsolutePath());
    }
}
