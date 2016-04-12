/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import static downfall.SpriteManager.ENEMY_01_STAND;
import static downfall.SpriteManager.ENEMY_01_STAND_01;
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
    
  
    private ImageManager imageManager;
    private HashMap<String, Animator> animators;
    public static final String ENEMY_01_STAND_01 = "ENEMY_01_STAND";
    imageManager = new ImageManager();
    
    
     ENEMY_01_STAND = new ArrayList<>();
     ENEMY_01_STAND.add(ENEMY_01_STAND_01);
     public static ArrayList<String> ENEMY_01_STAND;
     public static final String ENEMY_01_ANIMATOR = "ENEMY_01_ANIMATOR";
    BufferedImage EnemySprites = (BufferedImage) ResourceTools.loadImageFromResource("Downfall/Enemy01.png");
    
    imageManager.addImage(ENEMY_01_STAND, EnemySprites.getSubimage(94, 0, 30, 32));
    
    
    
    animators = new HashMap<>();

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
