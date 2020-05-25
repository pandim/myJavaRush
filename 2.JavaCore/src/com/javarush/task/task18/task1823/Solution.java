package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (true) {
            if ((fileName = reader.readLine()).equals("exit")) {
                break;
            }
            new ReadThread(fileName).start();
        }
//        Thread.sleep(1000);
//        System.out.println(resultMap);
    }

    public static class ReadThread extends Thread {
        String fileName;
        int[] bytes = new int[255];
        int max;
        int symbol;

        public ReadThread(String fileName) {
            this.fileName = fileName;

        }

        @Override
        public void run() {
            try {
                FileInputStream str = new FileInputStream(fileName);
                while (str.available() > 0) {
                    bytes[str.read()]++;
                }
                str.close();
            } catch (IOException e) {
                System.out.println("Ошибка!");
            }

            for (int i = 0; i < 255; i++) {
                if (max < bytes[i]) {
                    max = bytes[i];
                    symbol = i;
                }
                resultMap.put(fileName, symbol);
            }
        }
    }
}
