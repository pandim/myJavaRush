package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> array = new ArrayList<>();// Никому этот массив не нужен.
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        int symbol = reader.read();
        while (symbol != -1) {
            char c = (char) symbol;
            //if(s>64 & s<91 || s>96 & s<123) count++;
            //if ((data >= 'A' && data <= 'Z') || (data >= 'a' && data <= 'z'))
            //if (Character.isLetter(c)) - Неправильно! Здесь и русские буквы!
            // && !array.contains(c) - повторяющиеся?
            if ((c >= 'A' && c<= 'Z')||(c >= 'a' && c<= 'z'))
                array.add(c);// Никому этот массив не нужен. Просто счетчик
            // нуженю
            symbol = reader.read();
        }
        reader.close();
        System.out.println(array.size());
    }
}
