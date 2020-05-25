package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> setFileName = new TreeSet<>();
        String inputFileName;

        while (!(inputFileName = bufferedReader.readLine()).equals("end")) {
            setFileName.add(inputFileName);
        }
        bufferedReader.close();

        String tempName = setFileName.first();
        String outFileName = tempName.substring(0, tempName.lastIndexOf('.'));
//        File file = new File(outPutFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(outFileName, true);

        for (String fileNameInSet : setFileName) {
            FileInputStream fileInputStream = new FileInputStream(fileNameInSet);
            byte[] buff = new byte[fileInputStream.available()];
            if (buff.length > 0) {
                fileInputStream.read(buff);
                fileOutputStream.write(buff);
            }
            fileInputStream.close();
        }
        fileOutputStream.close();
    }
}
