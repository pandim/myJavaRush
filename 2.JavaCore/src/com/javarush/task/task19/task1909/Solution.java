package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter outFile = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String line = "";
        while (file.ready()) {
            line += (char) file.read();
        }
        file.close();

        line = line.replaceAll("\\.", "!");
        outFile.write(line);
        outFile.close();
    }

}

