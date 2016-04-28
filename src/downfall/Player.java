package downfall;


import environment.Direction;
import images.Animator;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

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

//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Player(int x, int y, int width, int height, Direction direction) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;

    }

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

    //<editor-fold defaultstate="collapsed" desc="hitbox">
    public Rectangle getHitBox() {
        return new Rectangle(x + (getWidth() / 4), y + (height / 4), getWidth() / 2, height / 2);
    }
//</editor-fold>

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

}
