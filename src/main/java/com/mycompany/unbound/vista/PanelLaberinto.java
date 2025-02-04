package com.mycompany.unbound.vista;

import com.mycompany.unbound.controlador.ControladorJuego;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class PanelLaberinto extends javax.swing.JPanel {

    /**
     * Creates new form PanelLaberinto
     */
    private ImageIcon fondo;
    private ControladorJuego controlador;

    public PanelLaberinto() {
        initComponents();
        fondo = new ImageIcon("./src/main/resources/img/LABERINTO.png");

    }

    public void setControlador(ControladorJuego controlador) {
        this.controlador = controlador;
    }

    public void escucharMouse(MouseListener controlador) {
        this.addMouseListener(controlador);
    }


    

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        fondo.paintIcon(null, g, 0, 0);
        if (controlador != null) {
            controlador.dibujar(g);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(850, 850));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
