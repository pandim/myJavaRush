package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;

public class EnemyShip extends Ship {
    public EnemyShip(double x, double y) {
        super(x, y);
        setStaticView(ShapeMatrix.ENEMY);
    }

   public void move(Direction direction, double speed) {
        switch (direction) {
            case RIGHT:
                this.x += speed;
                break;
            case LEFT:
                this.x -= speed;
                break;
            case DOWN:
                this.y += 2;
        }
    }

}
