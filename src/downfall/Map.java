/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.Direction;
import environment.Environment;
import environment.Velocity;
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

    public static int DEFAULT_FLOOR = 525; 

    private GameState state;
    private dfMenu gamestartMenu;
    private Enemy enemy01;
    private ArrayList<Item> items;
    private Player player;
    private final Image building01, skyscraper01, skyscraper02, HUDbackground, ladder, bricks, bricksII;

    public Map() {
        setState(GameState.RUNNING);
        this.state = GameState.MENU;

        this.setBackground(ResourceTools.loadImageFromResource("downfall/Images/apocalypsebackground.png").getScaledInstance(1265, 675, Image.SCALE_SMOOTH));

        building01 = ResourceTools.loadImageFromResource("downfall/Images/Niceland.png");
        skyscraper01 = ResourceTools.loadImageFromResource("downfall/Images/BuildingII.png");
        skyscraper02 = ResourceTools.loadImageFromResource("downfall/Images/BuildingIII.png");

        HUDbackground = ResourceTools.loadImageFromResource("downfall/Images/darkbrown.png");
        ladder = ResourceTools.loadImageFromResource("downfall/Images/ladder.png");
        bricks = ResourceTools.loadImageFromResource("downfall/Images/bricks.png");
        bricksII = ResourceTools.loadImageFromResource("downfall/Images/bricksII.png");

        player = new Player(500, 395, 70, 120, Direction.RIGHT);
        player.setFloor(DEFAULT_FLOOR);

        setUpGame();
        setState(GameState.RUNNING);

        items = new ArrayList<>();
    }

    private void setUpGame() {
        enemy01 = new Enemy_01(new Point(500, 430), 10, 103, 103, Direction.RIGHT, Action.STAND_RIGHT);

//        player = new Player(Direction.RIGHT);
//        player = getPlayer();
    }

//    private Player getPlayer(600, 430, 103, 103 Direction.RIGHT) {
//        return new Player(500, 395, 70, 130);
//    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {
        if (player != null) {
            player.move();
        }
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            player.addVelocity(new Velocity(0, -20));
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
//            player.addVelocity(new Velocity(0, -10));
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            player.addVelocity(new Velocity(-1, 0));
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            player.addVelocity(new Velocity(1, 0));
        }
//        if (e.getKeyCode() == KeyEvent.VK_W) {
//            player.setDirection(Direction.UP);
//        } else if (e.getKeyCode() == KeyEvent.VK_S) {
//            player.setDirection(Direction.DOWN);
//        } else if (e.getKeyCode() == KeyEvent.VK_A) {
//            player.setDirection(Direction.LEFT);
//        } else if (e.getKeyCode() == KeyEvent.VK_D) {
//            player.setDirection(Direction.RIGHT);
//        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }
    
    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.drawImage(building01, -70, 245, 400, 280, this);
        graphics.drawImage(skyscraper01, 475, -10, 350, 535, this);
        graphics.drawImage(skyscraper02, 910, -10, 350, 535, this);

        graphics.drawImage(HUDbackground, 0, DEFAULT_FLOOR, 1260, 145, this);
        graphics.drawImage(ladder, 840, 195, 60, 330, this);
        graphics.drawImage(bricksII, 460, 230, 370, 30, this);
        graphics.drawImage(bricks, 905, 130, 270, 30, this);
        graphics.drawImage(bricks, 1000, 350, 260, 30, this);

        graphics.setColor(Color.green);
        graphics.drawRect(0, 525, 1260, 145);
        
//        graphics.setColor(Color.red);
//        graphics.drawRect(500, 395, 70, 120);

        //map boundary
        graphics.setColor(Color.YELLOW);
        graphics.drawRect(0, 0, 1261, 671);

        
        if (enemy01 != null) {
            enemy01.draw(graphics);
        }
        
        if (player != null) {
            player.draw(graphics);
        }

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

//        graphics.drawRect(500, 395, 70, 130);
//
//        graphics.drawRect(500, 395, 70, 120);
//
//
//        graphics.setColor(Color.YELLOW);
//        graphics.drawRect(0, 0, 1251, 666);
    }

}
