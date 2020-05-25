package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.*;

public class GameObject {
    public double x;
    public double y;
    public int[][] matrix;
    public int width;
    public int height;

    public void setMatrix(int[][] matrix1){
        matrix = matrix1;
        width = matrix[0].length;
        height = matrix.length;

    }

    public void draw(Game game){
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < height; j++) {
                int colorIndex = matrix[j][i];
                game.setCellValueEx((int) x + i, (int) y + j, Color.values()[colorIndex], "") ;
            }

        }
    }

//    public void draw(Game game) {
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                int colorIndex = matrix[j][i];
//                game.setCellValueEx((int) x + i, (int) y + j, Color.values()[colorIndex], "");
//            }
//        }
//    }












    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
