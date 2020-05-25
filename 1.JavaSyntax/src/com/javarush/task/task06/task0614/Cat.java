package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {

    }

    public static void main(String[] args) {
        Cat[] catarr = new Cat[10];
        for (int i = 0; i < 10; i++) {catarr[i] = new Cat();
        Cat.cats.add(catarr[i]);
        }
        printCats();
    }

    public static void printCats() {
    for (Cat cat: Cat.cats)
            System.out.println(cat);
    }
}
