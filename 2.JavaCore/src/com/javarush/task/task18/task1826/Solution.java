package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String key = args[0];
        String fileIn = args[1];
        String fileOut = args[2];
        FileInputStream fis = new FileInputStream(fileIn);
        FileOutputStream fos = new FileOutputStream(fileOut);
        int b;
        while ((b = fis.read()) >= 0){
            if (key.equals("-e")){
                fos.write(b^0xFF);
            }else{
                fos.write(b^0xFF);
            }
        }
        fis.close();
        fos.close();

    }

}
