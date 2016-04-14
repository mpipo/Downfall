/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.Direction;
import images.Animator;
import images.ImageManager;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class EnemyMechanics {

    public void move() {
        if (direction == Direction.LEFT) {
            position.x -= getSpeed();
        } else if (direction == Direction.RIGHT) {
            position.x += getSpeed();
        } else if (direction == Direction.UP) {
            position.y -= getSpeed();
        } else if (direction == Direction.DOWN) {
            position.y += getSpeed();
        }
    }

    public Rectangle getHitBox() {
        return new Rectangle(position.x, position.y, width, height);
    }

    public void draw(Graphics graphics) {
        graphics.drawImage(getImage(), position.x, position.y, getWidth(), getHeight(), null);
//        graphics.setColor(Color.RED);
//        graphics.drawRect(getHitBox().x, getHitBox().y, getHitBox().width, getHitBox().height);
    }

    {
        setWidth(24);
        setHeight(26);
    }

//    public EnemyMechanics(String type, Point position, AnimatedImageProviderIntf imageProvider) {
    public EnemyMechanics(Point position, ImageManager imageManager) {
        
        this.position = position;
        this.speed = 2;
        
        this.animator = new Animator(imageManager, STAND, width)
        
        
        
//        if (type.equals(ENEMY_TYPE_01)) {
//            animatorName = SpriteManager;
//
//            STAND = SpriteManager."ENEMY_01_STAND;
//            WALK_LEFT = SpriteManager.ORANGE_FREDDY_WALK_LEFT;
//            WALK_RIGHT = SpriteManager.ORANGE_FREDDY_WALK_RIGHT;
//            WALK_UP = SpriteManager.ORANGE_FREDDY_WALK_UP;
//            WALK_DOWN = SpriteManager.ORANGE_FREDDY_WALK_DOWN;
//
//    
//    }
//    }
//
//      public static final String ENEMY_TYPE_01 = "ENEMY_01";
//    public static final String ENEMY_TYPE_YELLOW_CHICA = "YELLOW_CHICA";
//    public static final String ENEMY_TYPE_BLUE_BONNIE = "BLUE_BONNIE";
//    public static final String ENEMY_TYPE_ORANGE_FREDDY = "ORANGE_FREDDY";
    }
    private int width, height;
    private Point position;
    private ArrayList<String> STAND, WALK_LEFT, WALK_RIGHT, WALK_UP, WALK_DOWN;
//    private String animatorName;
    private Animator animator;
    private Direction direction;
    private AnimatedImageProviderIntf imageProvider;
    private int speed = 2;
    private Action action;

    public BufferedImage getImage() {
//        return imageProvider.getAnimatedImage(animatorName);
    }

    /**
     * @return the x
     */
    public int getX() {
        return position.x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.position.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return position.y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.position.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;

        switch (direction) {
            case LEFT:
                imageProvider.setAnimatorImageName(animatorName, this.WALK_LEFT);
                break;

            case RIGHT:
                imageProvider.setAnimatorImageName(animatorName, this.WALK_RIGHT);
                break;

            case UP:
                imageProvider.setAnimatorImageName(animatorName, this.WALK_UP);
                break;

            case DOWN:
                imageProvider.setAnimatorImageName(animatorName, this.WALK_DOWN);
                break;

//            default:
//            case DOWN:
//                imageProvider.setAnimatorImageName(animatorName, this.STAND);
//                break;
        }

    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the action
     */
    public Action getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(Action action) {
        this.action = action;
        
        switch (action){
            default:
            case STAND_RIGHT:
                
        }
        
    }

}
