/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesimulation;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Housesimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame("House Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        House house=new House();
                
        
        frame.add(house);
        frame.setVisible(true);
                
        
    }
    
}
