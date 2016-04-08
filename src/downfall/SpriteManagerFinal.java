/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import static downfall.SpriteManager.ENEMY_01_STAND_01;
import static downfall.SpriteManagerFinal.ENEMY_01_STAND_01;
import images.Animator;
import images.ImageManager;
import images.ResourceTools;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Luis
 */
//public class SpriteManagerFinal implements AnimatedImageProviderIntf{
//     private ImageManager imageManager;
//     private HashMap<String, Animator> animators;
//     public static final String ENEMY_01_STAND = "ENEMY_01_STAND_01";
//     imageManager = new ImageManager();
//     BufferedImage EnemySprites = (BufferedImage) ResourceTools.loadImageFromResource("Downfall/Enemy01.png");
//     public static ArrayList<String> ENEMY_01_STAND;
//   
//    
//     imageManager.addImage (ENEMY_01_STAND_01, EnemySprites.getSubimage (19, 123, 123, 123));

    
    
    
    

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
