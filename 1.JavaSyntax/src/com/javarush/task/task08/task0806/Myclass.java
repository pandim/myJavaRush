package com.javarush.task.task08.task0806;

import java.util.Date;

public class Myclass {
    public static Date date = new Date();

    public static void main(String[] args) {
            System.out.println(date.getTime());
            System.out.println(date.getHours());
            System.out.println(date.getMinutes());
            System.out.println(date.getSeconds());

        }
    }
