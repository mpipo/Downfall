/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.Direction;
import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import map.Item;

/**
 *
 * @author mpipo <>
 */
class Map extends Environment {

    private GameState state;
    private dfMenu gamestartMenu;
<<<<<<< HEAD
    private Enemy enemy01;
    private ArrayList<Item> items;
=======
    private Enemy Enemy01;
    private Player player;
>>>>>>> master

    public Map() {
        setState(GameState.RUNNING);
        this.state = GameState.MENU;

<<<<<<< HEAD
        this.setBackground(Color.black);
=======
>>>>>>> master
        this.setBackground(Color.white);
        
        setUpGame();
        setState(GameState.RUNNING);
        
        items = new ArrayList<>();
    }

<<<<<<< HEAD
    private void setUpGame() {
        enemy01 = new Enemy_01(new Point(323, 232), 10, 103, 103,Direction.RIGHT, Action.STAND_RIGHT);
=======
        player = new Player(Direction.RIGHT);

        player = getPlayer();
    }

    private Player getPlayer() {
        return new Player(500, 395, 70, 130);
>>>>>>> master
    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            player.setDirection(Direction.UP);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            player.setDirection(Direction.DOWN);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            player.setDirection(Direction.LEFT);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {

            player.setDirection(Direction.RIGHT);
        }

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        graphics.drawRect(475, -10, 350, 535);
        graphics.drawRect(900, -10, 350, 535);
        graphics.drawRect(-10, 225, 400, 300);

        graphics.setColor(Color.magenta);
        graphics.drawRect(0, 525, 1250, 140);

        graphics.setColor(Color.red);
<<<<<<< HEAD
        graphics.drawRect(450, 635, 80, 165);
        
        
//           if (items != null) {
//            for (int i = 0; i < items.size(); i++) {
//                items.get(i).draw(graphics);
    } 
   

    /**
     * @return the state
     */
    public GameState getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(GameState state) {
        this.state = state;
=======
        graphics.drawRect(500, 395, 70, 130);

        graphics.setColor(Color.YELLOW);
        graphics.drawRect(0, 0, 1251, 666);

    }

    private void setUpGame() {
        Enemy01 = new Enemy(Enemy01.ENEMY_STAND_RIGHT, new Point(323, 232), Enemy01);
>>>>>>> master
    }

}
