package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String filename;
        private String content = "";
        @Override
        public void setFileName(String fullFileName) {
            filename = fullFileName;
        }
        @Override
        public String getFileContent() {
            return content;
        }
        @Override
        public void run() {
            try {
                BufferedReader reader =
                        new BufferedReader(new FileReader(filename));
                String s;
                while ((s = reader.readLine()) != null) content += s + " ";
                content.substring(0, content.length() - 1);
                reader.close();
            } catch (IOException e) {
            }


        }
    }

    //add your code here - добавьте код тут
}
