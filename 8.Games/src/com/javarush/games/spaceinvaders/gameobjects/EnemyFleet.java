package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;
import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.ArrayList;
import java.util.List;

public class EnemyFleet {
    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;
    private Direction direction = Direction.RIGHT;//10-34

    public EnemyFleet() {
        createShips();
    }
    public void draw(Game game){
        for (EnemyShip ship: ships) { ship.draw(game);}
    }
    private double getSpeed(){
        return (2.0 < 3.0/ships.size()) ? 2.0: 3.0/ships.size();//10-34
    }

    private double getLeftBorder(){ //9-34
        double temp = Integer.MAX_VALUE;
        for (EnemyShip ship : ships) if (temp > ship.x) temp = ship.x;
        return temp;
    }

    public void move(){
        if (ships.size() == 0) return;//11-34
        Direction directionOld = direction;
        if ((direction == Direction.LEFT)&(getLeftBorder() < 0)) direction = Direction.RIGHT;
        if ((direction == Direction.RIGHT)&(getRightBorder() > SpaceInvadersGame.WIDTH)) direction = Direction.LEFT;
        for (EnemyShip esh : ships) {
            esh.move(direction != directionOld ? Direction.DOWN : direction, getSpeed());
        }
    }
    private double getRightBorder() { //9-34
        double temp = Integer.MIN_VALUE;
        for (EnemyShip esh : ships) if (temp < esh.x + esh.width) temp = esh.x + esh.width;
        return temp;
    }

    private void createShips(){
        ships = new ArrayList<EnemyShip>();
        for (int i = 0; i < COLUMNS_COUNT; i++) {
            for (int j = 0; j < ROWS_COUNT; j++) {
                ships.add(new EnemyShip(i*STEP, j*STEP+12));
            }

        }
    }
}
