package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length != 0 && (args[0].equals("-u") || args[0].equals("-d"))) {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            String line;
            ArrayList<String> strings = new ArrayList<>();
            String temp;
            while ((line = fileReader.readLine()) != null) {
                temp = line.substring(0, 8).trim();
                if (args[0].equals("-u") && temp.equals(args[1])) {
                    line = String.format("%-8.8s%-30.30s%-8.8s%-4.4s",
                            args[1], args[2], args[3], args[4]);
                }
                if (!(args[0].equals("-d") && temp.equals(args[1]))) {
                    strings.add(line);
                }
            }
            fileReader.close();

            FileOutputStream fos = new FileOutputStream(fileName);

            for (String string : strings) {
                fos.write((string + "\n").getBytes());
            }
            fos.close();
        }
    }
}
