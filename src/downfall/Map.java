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

/**
 *
 * @author mpipo <>
 */
class Map extends Environment {

    private final GameState state;
    private dfMenu gamestartMenu;
    private Enemy Enemy01;
    private Player player;

    public Map() {
        this.state = GameState.MENU;

        this.setBackground(Color.white);
        this.setBackground(ResourceTools.loadImageFromResource("downfall/Images/apocalypsebackground.png").getScaledInstance(1280, 720, Image.SCALE_SMOOTH));

        player = new Player(Direction.RIGHT);

        player = getPlayer();
    }

    private Player getPlayer() {
        return new Player(500, 395, 70, 130);
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
        graphics.drawRect(500, 395, 70, 120);

        graphics.setColor(Color.YELLOW);
        graphics.drawRect(0, 0, 1251, 666);

    }

    private void setUpGame() {
        Enemy01 = new Enemy(Enemy01.ENEMY_STAND_RIGHT, new Point(323, 232), Enemy01);
    }

}
