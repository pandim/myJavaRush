package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
protected String name;
protected int height;
protected String color;

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name) {
        this.name = name;
    }


    public static void main(String[] args) {

    }
}
