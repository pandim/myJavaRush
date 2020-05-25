package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static {
        String s = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                if ((s = reader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lines.add(s);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
