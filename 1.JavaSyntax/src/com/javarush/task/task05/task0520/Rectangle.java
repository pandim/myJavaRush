package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
protected int top;
protected int left;
protected int width;
protected int height;

public Rectangle(int top, int left, int width, int height){
    this.top = top; this.left = left; this.width = width; this.height = height;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = this.height = 0;
    }

    public Rectangle(Rectangle op){
        this.top = op.top; this.left = op.left; this.width = op.width; this.height = op.height;
    }

    public static void main(String[] args) {

    }
}
