package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in =
                new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter out =
                new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String[] line = in.readLine().split(" ");
        in.close();
        for (String string: line){
            out.write(Math.round(Double.parseDouble(string)) + " ");
        }
        out.close();
    }
}
