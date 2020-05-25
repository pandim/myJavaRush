package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;
import com.javarush.games.spaceinvaders.gameobjects.EnemyFleet;
import com.javarush.games.spaceinvaders.gameobjects.Star;

import java.util.ArrayList;
import java.util.List;

public class SpaceInvadersGame  extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    private List<Star> stars;
    private EnemyFleet enemyFleet;// 8-34


    private void createStars(){
        stars = new ArrayList<Star>();
        stars.add(new Star(10, 10));
        stars.add(new Star(20, 20));
        stars.add(new Star(30, 30));
        stars.add(new Star(40, 40));
        stars.add(new Star(50, 50));
        stars.add(new Star(60, 60));
        stars.add(new Star(48, 16));
        stars.add(new Star(16, 48));

    };

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        moveSpaceObjects();
        drawScene();// 8-34
          }

    private void createGame(){
        createStars();
        enemyFleet = new EnemyFleet();
        setTurnTimer(40);//8-34
        drawScene();


    }
    private void drawScene(){
        drawField();
        enemyFleet.draw(this);// 8-34
    }
    private void moveSpaceObjects(){
        enemyFleet.move();// 10-34
    }
    private void  drawField(){
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                setCellValueEx(x, y, Color.BLACK, "");
            }
        }
        for (Star star: stars) {star.draw(this);

        }
    }

}
