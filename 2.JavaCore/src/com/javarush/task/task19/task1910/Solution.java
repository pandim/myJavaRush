package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException { //\p{Punct}
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter outFile = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String line = "";
        while (file.ready()) {
            line += (char) file.read();
        }
        file.close();

        line = line.replaceAll("\\p{Punct}", "");
        outFile.write(line);
        outFile.close();

    }
}
