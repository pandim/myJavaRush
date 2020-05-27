package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file =
                new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter outFile = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String line = "";
        while (file.ready()) {
            line += (char) file.read();
        }
        file.close();

        Pattern pattern = Pattern.compile("\\b[\\d]+\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            outFile.write(matcher.group() + " ");
        }
        outFile.close();
    }
}
