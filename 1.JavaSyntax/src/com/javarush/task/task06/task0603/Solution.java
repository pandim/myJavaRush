package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
//        int catCounter = 50000;
//        Cat[] cats = new Cat[catCounter];
//        int dogCounter = 50000;
//        Dog[] dogs = new Dog[dogCounter];
//        for (int i = 1; i < catCounter; i++) cats[i] = new Cat();
//        for (int j = 1; j < dogCounter; j++) dogs[j] = new Dog();
        for (int i = 0; i < 50000; i++) {
            new Cat();
            new Dog();
        }

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
