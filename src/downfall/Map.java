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
<<<<<<< HEAD
        this.setBackground(Color.black);
=======
        this.setBackground(Color.white);
>>>>>>> origin/lm-animation-01
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

<<<<<<< HEAD
        graphics.drawRect(350, 0, 400, 670);
        graphics.drawRect(850, 0, 400, 670);
        graphics.drawRect(-10, 470, 300, 200);
        
        graphics.setColor(Color.yellow);
=======
        graphics.drawRect(850, 0, 500, 800);
        graphics.drawRect(1400, 0, 500, 800);
        graphics.drawRect(-10, 400, 700, 400);
        
        graphics.setColor(Color.magenta);
        graphics.drawRect(0, 800, 1920, 200);
        
        graphics.setColor(Color.red);
        graphics.drawRect(450, 635, 80, 165);
>>>>>>> origin/lm-animation-01

    }

}
