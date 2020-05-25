package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length != 0 && args[0].equals("-c")){
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();

            String line;
            int maxId = 0;
            int temp;
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                temp = Integer.parseInt(line.substring(0, 8).trim());
                if (temp > maxId) {
                    maxId = temp;
                }
            }
            fileReader.close();
            FileOutputStream fos = new FileOutputStream(fileName, true);
            fos.write(String.format("%n%-8s%-30.30s%-8.8s%-4.4s",
                    ++maxId,args[1], args[2], args[3]).getBytes());
            fos.close();

        }

    }
}
