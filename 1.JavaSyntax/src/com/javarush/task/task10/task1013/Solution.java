package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private int height;
        private String education;
        private String hobby;

        public Human(String name, boolean sex, int age, int height, String education, String hobby) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.education = education;
            this.hobby = hobby;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, int height) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }

        public Human(String name, boolean sex, int age, int height, String education) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.education = education;
        }

        public Human(boolean sex, int height) {
            this.sex = sex;
            this.height = height;
        }

        public Human(String name, boolean sex, String education) {
            this.name = name;
            this.sex = sex;
            this.education = education;
        }

        public Human(String name, boolean sex, String education, String hobby) {
            this.name = name;
            this.sex = sex;
            this.education = education;
            this.hobby = hobby;
        }

        public Human(boolean sex, int height, String hobby) {
            this.sex = sex;
            this.height = height;
            this.hobby = hobby;
        }
    }
}
