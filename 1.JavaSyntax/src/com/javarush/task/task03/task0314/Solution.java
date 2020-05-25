package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1 , b;
        while (a <= 10){
            b = 1;
            while (b <= 10){
                System.out.print(a*b + " ");
                b++;
            }
            System.out.println();
            a++;
        }

    }
}
