package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import javax.xml.soap.SOAPElementFactory;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        byte[] buffer;
        FileInputStream fileInputStream;
        do {
            fileInputStream = new FileInputStream(reader.readLine());
            buffer = new byte[fileInputStream.available()];
        } while (buffer.length >= 1000);
        reader.close();
        fileInputStream.close();
        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
