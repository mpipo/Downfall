/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import static downfall.SpriteManager.ENEMY_01_ANIMATOR;
import static downfall.SpriteManager.ENEMY_01_STAND;
//import static downfall.SpriteManager.ENEMY_01_STAND_01;
import images.Animator;
import images.ImageManager;
import images.ResourceTools;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Luis
 */
public class SpriteManager implements AnimatedImageProviderIntf {
    
  
//<editor-fold defaultstate="collapsed" desc="Properties">
    private ImageManager imageManager;
    private HashMap<String, Animator> animators;

    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Static Variable Declarations">
    public static final String ENEMY_01_ANIMATOR = "ENEMY_01_ANIMATOR";

//<editor-fold defaultstate="collapsed" desc="Enemy #01">
//    public static ArrayList<String> ENEMY_01_STAND_LEFT;
//    public static final String ENEMY_01_LEFT_STAND_01= "ENEMY_01_LEFT_STAND_01";

//    public static ArrayList<String> ENEMY_01_STAND_RIGHT;
//    public static final String ENEMY_01_RIGHT_STAND_01= "ENEMY_01_RIGHT_STAND_01";
//    
////    public static ArrayList<String> ENEMY_01_PUNCH_LEFT;
////    public static final String ENEMY_01_LEFT_PUNCH_01= "ENEMY_01_LEFT_PUNCH_01";
////    public static final String ENEMY_01_LEFT_PUNCH_02= "ENEMY_01_LEFT_PUNCH_02";
////    public static final String ENEMY_01_LEFT_PUNCH_03= "ENEMY_01_LEFT_PUNCH_03";
////    public static final String ENEMY_01_LEFT_PUNCH_04= "ENEMY_01_LEFT_PUNCH_04";
////    public static final String ENEMY_01_LEFT_PUNCH_05= "ENEMY_01_LEFT_PUNCH_05";
//
//    public static ArrayList<String> ENEMY_01_PUNCH_RIGHT;
//    public static final String ENEMY_01_RIGHT_PUNCH_01= "ENEMY_01_RIGHT_PUNCH_01";
//    public static final String ENEMY_01_RIGHT_PUNCH_02= "ENEMY_01_RIGHT_PUNCH_02";
//    public static final String ENEMY_01_RIGHT_PUNCH_03= "ENEMY_01_RIGHT_PUNCH_03";
//    public static final String ENEMY_01_RIGHT_PUNCH_04= "ENEMY_01_RIGHT_PUNCH_04";
//    public static final String ENEMY_01_RIGHT_PUNCH_05= "ENEMY_01_RIGHT_PUNCH_05";
//
//    
////    public static ArrayList<String> ENEMY_01_KICK_LEFT;
////    public static ArrayList<String> ENEMY_01_KICK_RIGHT;
////    
////    public static ArrayList<String> ENEMY_01_WALK_LEFT;
////    public static ArrayList<String> ENEMY_01_WALK_RIGHT;
////    
////    public static ArrayList<String> ENEMY_01_DIE_LEFT;
////    public static ArrayList<String> ENEMY_01_DIE_RIGHT;
////    
    
//</editor-fold>
    
    
//</editor-fold>
    {
    ImageManager imageManager = new ImageManager();
    
    }
     
    
 
     
    
     
     public static ArrayList<String> ENEMY_01_STAND;
//     public static final String ENEMY_01_ANIMATOR = "ENEMY_01_ANIMATOR";
//    BufferedImage EnemySprites = (BufferedImage) ResourceTools.loadImageFromResource("Downfall/Enemy01.png");
//    
//    imageManager.addImage(ENEMY_01_STAND, EnemySprites.getSubimage(31, 0, 30, 32));
//    
//    
//    
//    animators = new HashMap<>();
//    animators.put(ORANGE_FREDDY_ANIMATOR, new Animator(imageManager, ORANGE_FREDDY_STAND, 100));
//    animators.put (ENEMY_01_ANIMATOR, new Animator(ImageManager, ENEMY_01_STAND, 100));

//<editor-fold defaultstate="collapsed" desc="AnimatedImageProviderIntf">
    @Override
    public BufferedImage getAnimatedImage(String animatorName) {
        return (BufferedImage) animators.get(animatorName).getCurrentImage();
    }
    
    @Override
    public void setAnimatorImageName(String animatorName, ArrayList<String> ImageNames) {
        animators.get(animatorName).setImageNames(ImageNames);
    }
    
//</editor-fold>
}
