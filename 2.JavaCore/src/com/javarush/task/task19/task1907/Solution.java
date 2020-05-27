package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(reader.readLine());
        reader.close();
        String line = "";
        while (file.ready()) {
            line += (char) file.read();
        }
        file.close();
//        String[] result = line.split("\\W+");
//        System.out.println(Arrays.toString(result));
//        int world = result.length;

        System.out.println(line.split("\\bworld\\b").length-1);
    }
}
