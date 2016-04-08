/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import images.Animator;
import images.ImageManager;
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
