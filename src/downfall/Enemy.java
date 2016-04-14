/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.Direction;
import images.Animator;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Enemy {
    
    
    public Enemy(Point position, int speed, int width, int height, Direction direction, Action action){
        this.position = position;
        //...
        
        setAction(action);
    }

    Enemy(ArrayList<String> ENEMY_STAND_RIGHT, Point point, Enemy Enemy01) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
        public void move() {
        if (getDirection() == Direction.LEFT) {
            position.x -= getSpeed();
        } else if (getDirection() == Direction.RIGHT) {
            position.x += getSpeed();
        } else if (getDirection() == Direction.UP) {
            position.y -= getSpeed();
        } else if (getDirection() == Direction.DOWN) {
            position.y += getSpeed();
        }
    }

    public Rectangle getHitBox() {
        return new Rectangle(getPosition().x, getPosition().y, getWidth(), getHeight());
    }

    public void draw(Graphics graphics) {
        graphics.drawImage(getImage(), getPosition().x, getPosition().y, getWidth(), getHeight(), null);
//        graphics.setColor(Color.RED);
//        graphics.drawRect(getHitBox().x, getHitBox().y, getHitBox().width, getHitBox().height);
    }

    public ArrayList<String> ENEMY_STAND_RIGHT;
    public ArrayList<String> ENEMY_PUNCH_RIGHT;
 
    {
        ENEMY_STAND_RIGHT = new ArrayList<>();
        ENEMY_PUNCH_RIGHT = new ArrayList<>();
    }

//<editor-fold defaultstate="collapsed" desc="Properties">
    private Direction direction;
    private Point position;
    private int speed, width, height;
    Image image;
    private Action action;
    private Animator animator;
    
    private Image getImage(){
        return image;
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
    }
    
    /**
     * @return the position
     */
    public Point getPosition() {
        return position;
    }
    
    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }
    
    /**
     * @return the speed
     */
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
                animator.setImageNames(ENEMY_STAND_RIGHT);
                break;

            case PUNCH_RIGHT:
                animator.setImageNames(ENEMY_PUNCH_RIGHT);
                break;
        }
    }

    /**
     * @return the animator
     */
    public Animator getAnimator() {
        return animator;
    }

    /**
     * @param animator the animator to set
     */
    public void setAnimator(Animator animator) {
        this.animator = animator;
    }
//</editor-fold>
}
