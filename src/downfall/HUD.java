/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author theme
 */
public class HUD {

    private final Image pistol = ResourceTools.loadImageFromResource("downfall/Images/hud/weapons/pistol.png");
    
    public HUD() {
        
    }
    public void draw(Graphics graphics) {
        graphics.drawImage(pistol, 900, 525, null);
    }
}
