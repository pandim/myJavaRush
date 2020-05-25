package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static void main(String[] args) {

    }

    public boolean fight(Cat anotherCat) {
        int sum = 0;
        if (this.age > anotherCat.age) sum++;
        else if (this.age < anotherCat.age) sum--;
        if (this.strength > anotherCat.strength) sum++;
        else if (this.strength < anotherCat.strength) sum--;
        if (this.weight > anotherCat.weight) sum++;
        else if (this.weight > anotherCat.weight) sum--;
        if (sum > 0) return true;
        else return false;

    }
}
