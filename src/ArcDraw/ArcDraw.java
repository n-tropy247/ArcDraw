/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcDraw;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Ryan Castelli
 */
public class ArcDraw extends JFrame {
    
    public ArcDraw() {
        configureBoard();
    }
    
    private void configureBoard(){
        add(new ArcDrawer());
        setResizable(false);
        pack();
        
        setTitle("Arc Example");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new ArcDraw();
            ex.setVisible(true);
        });
    }
    
}
