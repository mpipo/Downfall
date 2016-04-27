package downfall;

import environment.Direction;
import environment.Velocity;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

// @author Mr_Hushbrown
//Add velocity, delta x, delta y properties
//Get extra help from Mr. Lawrence for this wih Ron
public class Player {

//<editor-fold defaultstate="collapsed" desc="Constructors">
    {
        this.velocity = new Velocity(0, 0);
        this.acceleration = new Velocity(0, 1);
        this.floor = 500;
    }

    public Player(int x, int y, int width, int height, Direction direction) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;
    }

    public Player(int x, int y, int width, int height, int velocity) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.health = 100;

    }
//</editor-fold>
    
     //<editor-fold defaultstate="collapsed" desc="properties">
    private Direction direction = Direction.RIGHT;
    private ArrayList<Point> body;
    private Color BodyColor = Color.GREEN;
    private int mouthWidth;


    //<editor-fold defaultstate="collapsed" desc="properties">
    private int x, y;
    private int width, height;
    private int health = 100;
//    private Color color;
//    private double speed = 11.25;
    private Velocity velocity;
    private Velocity acceleration;
    private int floor;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the velocity
     */
    public Velocity getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(Velocity velocity) {
        this.velocity = velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void addVelocity(Velocity velocity) {
        this.velocity.x += velocity.x;
        this.velocity.y += velocity.y;
    }

    /**
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * @return the acceleration
     */
    public Velocity getAcceleration() {
        return acceleration;
    }

    /**
     * @param acceleration the acceleration to set
     */
    public void setAcceleration(Velocity acceleration) {
        this.acceleration = acceleration;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="hitbox">
    public Rectangle getHitBox() {
        return new Rectangle(getX() + (getWidth() / 4), getY() + (height / 4), getWidth() / 2, height / 2);
    }
//</editor-fold>

    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawRect(x, y, width, height);
    }

    //<editor-fold defaultstate="collapsed" desc="movement">
    public void move() {
        if (isAlive()) {
            //move the guy
            x += velocity.x;
            y += velocity.y;

            //correct vertical motion for floor;
            if (y >= floor - height) {//fallen through the floor
                //put back on the floor
                y = floor - height;
                //set vertical velocity to zero
                velocity.y = 0;
            } else {
                velocity.y += acceleration.y;
            }

            velocity.x += acceleration.x;

//             if (getDirection() == Direction.LEFT) {
//                 setX(getX() - getSpeed());
//             } else if (getDirection() == Direction.RIGHT) {
//                 setX(getX() + getSpeed());
//             } else if (getDirection() == Direction.DOWN) {
//                 setY(getY() + getSpeed());
//             } else if (getDirection() == Direction.UP) {
//                 setY(getY() - getSpeed());
//             }
        }
    }

    private int getBottom() {
        return y + height;
    }

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Health">
    public int getHealth() {
        return health;
    }

    public void kill() {
        this.health = 0;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

//</editor-fold>
}
