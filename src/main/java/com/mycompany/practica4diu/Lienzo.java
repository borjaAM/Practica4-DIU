package com.mycompany.practica4diu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author Grupo 6
 */
public class Lienzo extends JPanel{
   
    private Color color;
    private Point vect[];
    private int pos;
    private boolean paint,mc;
    
    public Lienzo(){
        this.setForeground(new java.awt.Color(0, 51, 204));
        vect = new Point[5];
        defaultVect();
        pos =0;
        paint = false;
        mc=false;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(paint){
            for (int i = 0; i < 5; i++) {
                if(mc){
                    switch(i){
                        case 0: g.setColor(new java.awt.Color(0, 51, 204));
                                break;
                        case 1: g.setColor(Color.red);
                                break;
                        case 2: g.setColor(Color.orange);
                                break;
                        case 3: g.setColor(new java.awt.Color(0, 204, 0));
                                break;
                        case 4: g.setColor(new java.awt.Color(179, 0, 59));
                                break;
                    }
                }
                g.fillOval(vect[i].x, vect[i].y, 10, 10);
            }
        }
    }
    
    public void mousePosition(Point p){
        paint = true;
        for (int i = pos; i>0; i--) {
            vect[i] = vect[i-1];
        }
        vect[0] = new Point(p.x, p.y);
        pos++;
        if(pos == 5){
            pos = 0;
        }
        this.repaint();
    }
    
    public void borrarLienzo(){
        paint = false;
        defaultVect();
        pos=0;
        this.repaint();
    }
    public void multicolor(boolean mc){
        this.mc = mc;
    }
    private void defaultVect(){
        for (int i = 0; i < 5; i++) {
            vect[i] = new Point(-10,-10);
        }
    }
}
