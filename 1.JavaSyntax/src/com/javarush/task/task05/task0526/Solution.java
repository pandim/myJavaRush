package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vasya", 32, "dom 1");
        Man man2 = new Man("Petya", 33, "dom 2");
        Woman woman1 = new Woman("Masha", 25, "dom 3");
        Woman woman2 = new Woman("Katya", 30, "dom 7");
        pr(man1);
        pr(man2);
        pr(woman1);
        pr(woman2);
    }

    public static void pr(Man myobj) {
        System.out.println(myobj.name + " " + myobj.age + " " + myobj.address);
    }

    public static void pr(Woman myobj) {
        System.out.println(myobj.name + " " + myobj.age + " " + myobj.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}


