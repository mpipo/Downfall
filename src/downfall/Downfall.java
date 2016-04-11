/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.ApplicationStarter;
import environment.Environment;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author mpipo, Mr_Hushbr0wn <>
 */
public class Downfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        run("Downfall", true, new Map());
    }
        public static JFrame run(String appName, boolean isMaximized, Environment environment) {
        JFrame frame = new JFrame(appName);

        frame.add(environment);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            if (isMaximized) {
                frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            }
        frame.setVisible(true);
        return frame;
    }
    
}
