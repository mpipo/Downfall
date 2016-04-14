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
        {
//        ApplicationStarter.run("PacPong Run", new Arena());
            ApplicationStarter.run(new String[0], "PacPong", new Dimension(1280, 720), new Map());

        }

    }
}
