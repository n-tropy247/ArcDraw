/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArcDraw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Ryan Castelli
 */
public class ArcDrawer extends JPanel {
    
    private int x1,x2,y1,y2,height,width;
    
    public ArcDrawer() {
        config();
        init();
        findVal();
        repaint();
    }
    
    private void findVal() {
        x1 = 100;
        y1 = 75;
        x2 = 350;
        y2 = 170;
        
        width = x2-x1;
        height = y2-y1;
    }
    
    private void config() {
        setBackground(Color.gray);
        setFocusable(true);
        setPreferredSize(new Dimension(500, 500));
    }
    
    private void init() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException exe) {
            System.err.println("Nimbus unavailable");
        }

        setLayout(new BorderLayout());
        setSize(700, 600);

        JPanel p1 = new JPanel();

        p1.setLayout(new FlowLayout());

        add(p1, BorderLayout.PAGE_END);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
            doDrawing(g);
    }
    
    private void doDrawing(Graphics g) {
        g.setColor(Color.red);
        g.drawArc(x1-(width)+5,y1+4,width*2,height*2,0,90);
        g.fillOval(x1, y1, 10, 10);
        g.fillOval(x2,y2,10,10);
    }
}
