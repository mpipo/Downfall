package downfall;


import environment.Direction;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus pc
 */
public class Player {

    public Player(Direction direction) {
        this.direction = direction;

    }

    //<editor-fold defaultstate="collapsed" desc="properties">
    private Direction direction = Direction.RIGHT;
    private ArrayList<Point> body;
    private Color BodyColor = Color.GREEN;
    private int mouthWidth;

    private int x, y;
    private int width, height;

    private int health = 100;

    private Color color;
    
    private double speed = 11.25; 
//</editor-fold>

    public Player(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.health = 100;

    }
    
     public void draw(Graphics graphics) {
         graphics.fillRect(10, 300, 50, 50);
     }
    
     //<editor-fold defaultstate="collapsed" desc="movement">
//     public void move() {
//         if (isAlive()) {
//             if (getDirection() == Direction.LEFT) {
//                 x -= getSpeed();
//             } else if (getDirection() == Direction.RIGHT) {
//                 x += getSpeed();
//             } else if (getDirection() == Direction.DOWN) {
//                 y += getSpeed();
//             } else if (getDirection() == Direction.UP) {
//                 y -= getSpeed();
//             }
//         }
//     }
//</editor-fold>
     
     //<editor-fold defaultstate="collapsed" desc="Health">
     public int getHealth() {
         return health;
     }
     
     public void kill() {
         this.health = 0;
         color = Color.DARK_GRAY;
     }
     
     public void setHealth(int Health) {
         this.health = Health;
     }
     
     public void addHealth(int health) {
         this.health += health;
     }
     
     public boolean isAlive() {
         return (health > 0);
     }
     
     public boolean isDead() {
         return (health <= 0);
     }
//</editor-fold>
     
     //<editor-fold defaultstate="collapsed" desc="get and set">
     public Direction getDirection() {
         return direction;
     }
     
     public void setDirection(Direction direction) {
         this.direction = direction;
     }
     
     public void setBodyColor(Color BodyColor) {
         this.BodyColor = BodyColor;
     }
     
     public int getWidth() {
         return width;
     }
     
     public void setWidth(int width) {
         this.width = width;
     }
     
     public double getSpeed() {
         return speed;
     }
     
     public void setSpeed(double speed) {
         this.speed = speed;
     }
     public void addSpeed(double speed) {
         this.speed += speed;
     }
//</editor-fold>
     
}
