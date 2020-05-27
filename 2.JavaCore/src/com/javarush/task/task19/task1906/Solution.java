package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        FileReader inFile = new FileReader(reader.readLine());
        FileWriter outFile = new FileWriter(reader.readLine());
        reader.close();
        int ch;
        boolean key = true;
        while ((ch = inFile.read()) != -1){
            key = !key;
            if (key) outFile.write(ch);
        }
        inFile.close();
        outFile.close();
    }
}
