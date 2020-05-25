package com.javarush.task.task13.task1326;

/*
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        int[] ints = Files.lines(Paths.get(fileName)).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(ints);
        for (int i : ints) {if (i % 2 == 0) System.out.println(i);}
    }
}

