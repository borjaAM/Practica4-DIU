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
    private boolean paint;
    
    public Lienzo(){
        this.setForeground(new java.awt.Color(0, 51, 204));
        vect = new Point[5];
        for (int i = 0; i < 5; i++) {
            vect[i] = new Point(-1,-1);
        }
        pos =0;
        paint = false;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < 5; i++) {
            g.fillOval(vect[i].x, vect[i].y, 8, 8);
        }
        
    }
    
    public void mousePosition(Point p){
        vect[pos] = new Point(p.x+5, p.y+20);
        pos++;
        if(pos == 5){
            paint = true;
            pos = 0;
            this.repaint();
        }
    }
}
