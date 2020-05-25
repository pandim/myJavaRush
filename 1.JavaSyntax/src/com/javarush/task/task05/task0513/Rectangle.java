package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
protected int top;
protected int left;
protected int width;
protected int height;

public void  initialize (int top, int left, int width, int height){
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
}
    public void  initialize (int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void  initialize (int top, int left, int height){
        this.top = top;
        this.left = left;
        this.width = height;
        this.height = height;
    }
    public void  initialize (Rectangle osn){
        this.top = osn.top;
        this.left = osn.left;
        this.width = osn.width;
        this.height = osn.height;
    }

    public static void main(String[] args) {

    }
}
