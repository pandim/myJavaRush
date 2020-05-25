package com.javarush.task.task08.task0824;

/*
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Human vitya = new Human("Витя", true, 4);
        Human vanya = new Human("Ваня", true, 17);
        Human anya = new Human("Аня", false, 31);
        Human papaDima = new Human("Дима", true, 51, anya, vanya, vitya);
        Human mamaTanya = new Human("Таня", false, 51, anya, vanya, vitya);
        Human babaValya = new Human("Валя", false, 71, papaDima);
        Human dedTolya = new Human("Анатолий", true, 75, papaDima);
        Human dedIvan = new Human("Иван", true, 78, mamaTanya);
        Human babaTonya = new Human("Антонина", false, 75, mamaTanya);
        ArrayList<Human> everybody = new ArrayList<>(Arrays.asList(vanya, vitya, anya, papaDima, mamaTanya, babaValya, dedTolya, babaTonya, dedIvan));
        for (Human human: everybody) {
            System.out.println(human.toString());
        }
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;// Вариант 1
//        public ArrayList<Human> children = new ArrayList<>();// Вариант 2 - Что-бы заработало, надо обязательно создать!!!

        public Human(String name, boolean sex, int age, Human ...  human) {
            this.children = new ArrayList<>(Arrays.asList(human)); //Вариант 1
            this.name = name;
            this.sex = sex;
            this.age = age;
//            Collections.addAll(this.children, human);//Вариант 2
//            this.children.addAll(Arrays.asList(human));//Вариант 3, тоже надо создавать List обязательно.
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

