package downfall;

import environment.Direction;
<<<<<<< HEAD
import images.Animator;
=======
import environment.Velocity;
>>>>>>> master
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

<<<<<<< HEAD
 // @author Mr_Hushbrown
//Add velocity, delta x, delta y properties
//Get extra help from Mr. Lawrence for this wih Ron
public class Player {

    public static final String PLAYER_RIGHT_STAND_01 = "PLAYER_RIGHT_STAND_01";
    public static final String PLAYER_RIGHT_STAND_02 = "PLAYER_RIGHT_STAND_02";
    public static final String PLAYER_RIGHT_STAND_03 = "PLAYER_RIGHT_STAND_03";
    public static final String PLAYER_RIGHT_STAND_04 = "PLAYER_RIGHT_STAND_04";

    {
        PLAYER_STAND_RIGHT.add(PLAYER_01_RIGHT_STAND_01);
        PLAYER_STAND_RIGHT.add(PLAYER_01_RIGHT_STAND_02);
        PLAYER_STAND_RIGHT.add(PLAYER_01_RIGHT_STAND_03);
        PLAYER_STAND_RIGHT.add(PLAYER_01_RIGHT_STAND_04);

        setAnimator(new Animator(imageManager, PLAYER_PUNCH_RIGHT, 200));

    }
=======
// @author Mr_Hushbrown
//Add velocity, delta x, delta y properties
//Get extra help from Mr. Lawrence for this wih Ron
public class Player {
>>>>>>> master

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

<<<<<<< HEAD
    public Player(Point position, int speed, int width, int height, Direction direction, Action action) {
        this.position = position;
        this.speed = speed;
        this.height = height;
        this.width = width;
        this.direction = direction;
        this.action = action;

        //...
        setAction(action);

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="properties">
  
    private ArrayList<Point> body;
    private Color BodyColor = Color.GREEN;
    private int mouthWidth;
    private int width, height;
    private int health = 100;
    private Color color;
    private Direction direction;
    private Point position;
    private int speed;
    private Image image;
    private Action action;
    private Animator animator;
//</editor-fold>

=======
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
>>>>>>> master
    //<editor-fold defaultstate="collapsed" desc="hitbox">
    public Rectangle getHitBox() {
        return new Rectangle(getX() + (getWidth() / 4), getY() + (height / 4), getWidth() / 2, height / 2);
    }
//</editor-fold>

<<<<<<< HEAD
    //<editor-fold defaultstate="collapsed" desc="movement">
    public void move() {
        if (isAlive()) {
            if (getDirection() == Direction.LEFT) {
                x -= getSpeed();
            } else if (getDirection() == Direction.RIGHT) {
                x += getSpeed();
            } else if (getDirection() == Direction.DOWN) {
                y += getSpeed();
            } else if (getDirection() == Direction.UP) {
                y -= getSpeed();
            }
        }
    }
//</editor-fold>

=======
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
    
>>>>>>> master
    //<editor-fold defaultstate="collapsed" desc="Health">
    public int getHealth() {
        return health;
    }

    public void kill() {
        this.health = 0;
<<<<<<< HEAD
        color = Color.DARK_GRAY;
=======
>>>>>>> master
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

<<<<<<< HEAD
    public void setBodyColor(Color BodyColor) {
        this.BodyColor = BodyColor;
    }

=======
>>>>>>> master
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

<<<<<<< HEAD
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void addSpeed(int speed) {
        this.speed += speed;
    }
//</editor-fold>

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
    }

=======
//</editor-fold>
>>>>>>> master
}
