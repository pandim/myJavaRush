package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file =
                new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String string;
//        String[] strings = new String[4];
        String[] strings; //Идея пропустила так, валидатор - не знаю.
        while ((string = file.readLine()) != null) {
            strings = string.split(" ");
            if (strings[0].equals(args[0])) {
                System.out.println(string);
                break;
            }
        }
        file.close();
    }
}
