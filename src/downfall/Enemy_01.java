/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.Direction;
import images.Animator;
import images.ImageManager;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Enemy_01 extends Enemy {

    public static final String ENEMY_01_RIGHT_STAND_01 = "ENEMY_01_RIGHT_STAND_01";
//    public static final String ENEMY_01_RIGHT_STAND_02 = "ENEMY_01_RIGHT_STAND_02";
    

    public static final String ENEMY_01_RIGHT_PUNCH_01 = "ENEMY_01_RIGHT_PUNCH_01";
    public static final String ENEMY_01_RIGHT_PUNCH_02 = "ENEMY_01_RIGHT_PUNCH_02";
    public static final String ENEMY_01_RIGHT_PUNCH_03 = "ENEMY_01_RIGHT_PUNCH_03";
    public static final String ENEMY_01_RIGHT_PUNCH_04 = "ENEMY_01_RIGHT_PUNCH_04";
    public static final String ENEMY_01_RIGHT_PUNCH_05 = "ENEMY_01_RIGHT_PUNCH_05";

//    public static ArrayList<String> ENEMY_01_PUNCH_LEFT;
//    public static final String ENEMY_01_LEFT_PUNCH_01= "ENEMY_01_LEFT_PUNCH_01";
//    public static final String ENEMY_01_LEFT_PUNCH_02= "ENEMY_01_LEFT_PUNCH_02";
//    public static final String ENEMY_01_LEFT_PUNCH_03= "ENEMY_01_LEFT_PUNCH_03";
//    public static final String ENEMY_01_LEFT_PUNCH_04= "ENEMY_01_LEFT_PUNCH_04";
//    public static final String ENEMY_01_LEFT_PUNCH_05= "ENEMY_01_LEFT_PUNCH_05";
//    public static ArrayList<String> ENEMY_01_KICK_LEFT;
//    public static ArrayList<String> ENEMY_01_KICK_RIGHT;
//    
//    public static ArrayList<String> ENEMY_01_WALK_LEFT;
//    public static ArrayList<String> ENEMY_01_WALK_RIGHT;
//    
//    public static ArrayList<String> ENEMY_01_DIE_LEFT;
//    public static ArrayList<String> ENEMY_01_DIE_RIGHT;
//    
    {
        ENEMY_STAND_RIGHT.add(ENEMY_01_RIGHT_STAND_01);
//        ENEMY_STAND_RIGHT.add(ENEMY_01_RIGHT_STAND_02);

        ENEMY_PUNCH_RIGHT.add(ENEMY_01_RIGHT_PUNCH_01);
        ENEMY_PUNCH_RIGHT.add(ENEMY_01_RIGHT_PUNCH_02);
        ENEMY_PUNCH_RIGHT.add(ENEMY_01_RIGHT_PUNCH_03);
        ENEMY_PUNCH_RIGHT.add(ENEMY_01_RIGHT_PUNCH_04);
        ENEMY_PUNCH_RIGHT.add(ENEMY_01_RIGHT_PUNCH_05);

        BufferedImage spritesheet = (BufferedImage) ResourceTools.loadImageFromResource("downfall/ENEMY01SpriteSheet.png");

        ImageManager imageManager = new ImageManager();
        imageManager.addImage(ENEMY_01_RIGHT_STAND_01, spritesheet.getSubimage(82, 455, 55, 82));
//       imageManager.addImage(ENEMY_01_RIGHT_STAND_02, spritesheet.getSubimage(82, 455, 55, 82));
        
        imageManager.addImage(ENEMY_01_RIGHT_STAND_01, image);
//        imageManager.addImage(ENEMY_01_RIGHT_STAND_02, image);

//        imageManager.addImage(ENEMY_01_RIGHT_PUNCH_01, spritesheet.getSubimage(x, y, w, h));
        //..
        setAnimator(new Animator(imageManager, ENEMY_STAND_RIGHT, 200));
    }

    public Enemy_01(Point position, int speed, int width, int height, Direction direction, Action action) {
        super(position, speed, width, height, direction, action);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(getImage(), this.getPosition().x, this.getPosition().y, null);
        
//        graphics.setColor(Color.RED);
//        graphics.drawRect(getHitBox().x, getHitBox().y, getHitBox().width, getHitBox().height);
    }
    
    
    private Image getImage(){
        return getAnimator().getCurrentImage();
    }

}
