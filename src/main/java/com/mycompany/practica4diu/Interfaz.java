/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4diu;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grupo 6
 */
public class Interfaz extends javax.swing.JFrame {

    
    public Interfaz() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(230, 255, 230));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLienzo = new javax.swing.JPanel();
        lienzo = new com.mycompany.practica4diu.Lienzo();
        panelConfigurar = new javax.swing.JPanel();
        labelBackground = new javax.swing.JLabel();
        background = new javax.swing.JComboBox<>();
        labelBrush = new javax.swing.JLabel();
        brush = new javax.swing.JComboBox<>();
        authors = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLienzo.setBackground(new java.awt.Color(255, 153, 102));
        panelLienzo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lienzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 14))); // NOI18N

        lienzo.setBackground(new java.awt.Color(255, 255, 255));
        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lienzoMouseMoved(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lienzoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLienzoLayout = new javax.swing.GroupLayout(panelLienzo);
        panelLienzo.setLayout(panelLienzoLayout);
        panelLienzoLayout.setHorizontalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLienzoLayout.setVerticalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelConfigurar.setBackground(new java.awt.Color(153, 153, 255));
        panelConfigurar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración Lienzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 14))); // NOI18N

        labelBackground.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        labelBackground.setText("Fondo:");

        background.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        background.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Azul", "Lima", "Lila", "Amarillo" }));
        background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundActionPerformed(evt);
            }
        });

        labelBrush.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        labelBrush.setText("Estela:");

        brush.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        brush.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul Marino", "Rojo", "Naranja", "Verde", "Vino", "Multicolor" }));
        brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConfigurarLayout = new javax.swing.GroupLayout(panelConfigurar);
        panelConfigurar.setLayout(panelConfigurarLayout);
        panelConfigurarLayout.setHorizontalGroup(
            panelConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurarLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(labelBackground)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(labelBrush)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brush, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        panelConfigurarLayout.setVerticalGroup(
            panelConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBackground)
                    .addComponent(labelBrush)
                    .addComponent(brush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        authors.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        authors.setText("Hecho por: Borja Álvarez y Esther Zurita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelConfigurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(authors)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(authors)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundActionPerformed
       
        switch(background.getSelectedIndex()){
            case 0: lienzo.setBackground(Color.white);
                    break;
            case 1: lienzo.setBackground(new java.awt.Color(51, 173, 255));
                    break;
            case 2: lienzo.setBackground(new java.awt.Color(170, 255, 0));
                    break;
            case 3: lienzo.setBackground(new java.awt.Color(204, 153, 255));
                    break;
            case 4: lienzo.setBackground(new java.awt.Color(255, 255, 26));
                    break;
        }
    }//GEN-LAST:event_backgroundActionPerformed
    private void lienzoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseMoved
        lienzo.mousePosition(evt.getPoint());
        try {
            sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lienzoMouseMoved

    private void brushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushActionPerformed
        switch(brush.getSelectedIndex()){
            case 0: lienzo.multicolor(false); lienzo.setForeground(new java.awt.Color(0, 51, 204));
                    break;
            case 1: lienzo.multicolor(false);lienzo.setForeground(Color.red);
                    break;
            case 2: lienzo.multicolor(false);lienzo.setForeground(Color.orange);
                    break;
            case 3: lienzo.multicolor(false);lienzo.setForeground(new java.awt.Color(0, 204, 0));
                    break;
            case 4: lienzo.multicolor(false); lienzo.setForeground(new java.awt.Color(179, 0, 59));
                    break;
            case 5: lienzo.multicolor(true);
                    break;
        }
    }//GEN-LAST:event_brushActionPerformed

    private void lienzoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseExited
        lienzo.borrarLienzo();
    }//GEN-LAST:event_lienzoMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authors;
    private javax.swing.JComboBox<String> background;
    private javax.swing.JComboBox<String> brush;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelBrush;
    private com.mycompany.practica4diu.Lienzo lienzo;
    private javax.swing.JPanel panelConfigurar;
    private javax.swing.JPanel panelLienzo;
    // End of variables declaration//GEN-END:variables
}
