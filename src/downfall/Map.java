/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.Direction;
import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
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
    private Enemy enemy01;
    private ArrayList<Item> items;

    public Map() {
        setState(GameState.RUNNING);
        this.state = GameState.MENU;

        this.setBackground(Color.black);
        this.setBackground(Color.white);
        
        setUpGame();
        setState(GameState.RUNNING);
        
        items = new ArrayList<>();
    }

    private void setUpGame() {
        enemy01 = new Enemy_01(new Point(323, 232), 10, 103, 103,Direction.RIGHT, Action.STAND_RIGHT);
    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {


        graphics.drawRect(350, 0, 400, 670);
        graphics.drawRect(850, 0, 400, 670);
        graphics.drawRect(-10, 470, 300, 200);
        
        graphics.setColor(Color.yellow);

        graphics.drawRect(850, 0, 500, 800);
        graphics.drawRect(1400, 0, 500, 800);
        graphics.drawRect(-10, 400, 700, 400);
        
        graphics.setColor(Color.magenta);
        graphics.drawRect(0, 800, 1920, 200);
        
        graphics.setColor(Color.red);
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
    }

}
