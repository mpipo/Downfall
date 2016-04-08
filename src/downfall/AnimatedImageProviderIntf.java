/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public interface AnimatedImageProviderIntf {
    public BufferedImage getAnimatedImage(String animatorName);
    public void setAnimatorImageName(String animatorName, ArrayList<String> ImageNames);
    
}
