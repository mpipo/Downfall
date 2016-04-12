/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author mpipo <>
 */
class Map extends Environment {

    private final GameState state;
    private dfMenu gamestartMenu;

    public Map() {
        this.state = GameState.MENU;
        this.setBackground(Color.white);
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

        graphics.drawRect(475, 0, 350, 500);
        graphics.drawRect(900, 0, 350, 500);
        graphics.drawRect(-10, 200, 400, 300);
        
        graphics.setColor(Color.magenta);
        graphics.drawRect(0, 500, 1250, 165);
        
        graphics.setColor(Color.red);
        graphics.drawRect(500, 370, 70, 130);

    }

}
