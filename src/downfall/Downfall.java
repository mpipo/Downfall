/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downfall;

import environment.ApplicationStarter;
import java.awt.Dimension;

/**
 *
 * @author mpipo <>
 */
public class Downfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationStarter.run(args, "Downfall", new Dimension(1280, 720), new Nation());
    }
    
}
