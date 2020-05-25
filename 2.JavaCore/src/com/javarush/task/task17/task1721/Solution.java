package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 =
                new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        BufferedReader reader2 =
                new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        reader.close();
        String s;
        while ((s = reader1.readLine()) != null) allLines.add(s);
        while ((s = reader2.readLine()) != null) forRemoveLines.add(s);
        reader1.close();
        reader2.close();
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }


}
