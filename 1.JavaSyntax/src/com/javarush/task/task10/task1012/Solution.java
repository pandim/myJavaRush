package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //Сложим в одну строку
        StringBuilder summ = new StringBuilder();
        for (String string: list) {
            summ.append(string);
        }
        //Перебираем и на печать
        //Сначала хотел в map, а потом на печать
//        Map<Character, Integer> map = new HashMap<>();
        int num, start, ex;
        for (Character character: alphabet) {
            num = start = 0;
            do {
                ex = summ.toString().indexOf(character, start);
                if (ex >= 0) {num++; start = ex + 1; }
            } while (ex >= 0);
//            map.put(character, num);
            System.out.println(character + " " + num);
        }
    }
}
