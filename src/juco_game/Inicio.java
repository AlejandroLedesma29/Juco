/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juco_game;

import Elements.Images;
import Elements.barrier;
import Elements.mapa;
import Elements.player;
import Elements.element;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author L E D E S M A
 */
public class Inicio extends javax.swing.JFrame implements KeyListener{
    player newPlayer;
    player newPlayer2;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
        mapa Mapa1 = new mapa("001");
        //Creacion bordes mapa
        bordes_mapa(Mapa1);
        //Creacion de muros primera parte     
        muros_superior(Mapa1);
        //Creacion de muros segunda parte
        muros_inferior(Mapa1);
        
        //Creacion de jugadores
        this.newPlayer = new player(200,"src/pictures/bola1.png",25,142,18,18,"globo_rojo");
        Mapa1.getMisElementos().add(this.newPlayer);
        
        this.newPlayer2 = new player(200,"src/pictures/bola2.png",25,388,18,18,"globo_amarillo");
        Mapa1.getMisElementos().add(this.newPlayer2);
        
        lienzo1.setMiMapa(Mapa1);
        Thread proceso = new Thread(lienzo1);
        this.lienzo1.setActivo(true);
        proceso.start();
        
    }
    public void bordes_mapa(mapa Mapa1){
        barrier top = new barrier(Color.BLACK,0,0,800,20,"top");
        barrier right = new barrier(Color.BLACK,785,0,15,500,"rigth");
        barrier left = new barrier(Color.BLACK,0,0,15,500,"left");
        barrier down = new barrier(Color.BLACK,0,500,800,20,"down");
        barrier middle = new barrier(Color.BLACK,0,250,800,15,"middle");
        Mapa1.getMisElementos().add(top);
        Mapa1.getMisElementos().add(right);
        Mapa1.getMisElementos().add(left);
        Mapa1.getMisElementos().add(down);
        Mapa1.getMisElementos().add(middle);
    }
    public void muros_superior(mapa Mapa1){
        
        barrier uno = new barrier(Color.BLACK,0,0,50,130,"left");
        barrier dos  = new barrier(Color.BLACK,0,175,50,80,"left");
        
        barrier ultimo = new barrier(Color.BLACK,750,0,50,100,"rigth");
        barrier penultimo  = new barrier(Color.BLACK,750,150,50,100,"rigth");
        
        barrier ctop = new barrier(Color.BLACK,95,100,105,30,"top-down");
        barrier cright = new barrier(Color.BLACK,170,65,30,60,"rigth");
        barrier cleft = new barrier(Color.BLACK,95,65,30,60,"left");
        barrier cdown = new barrier(Color.BLACK,95,175,105,30,"down");
        
        barrier mtop  = new barrier(Color.BLACK,245,0,30,130,"rigth-top");
        barrier mdown  = new barrier(Color.BLACK,245,175,30,80,"rigth-down");
        
        barrier mmid  = new barrier(Color.BLACK,320,65,80,140,"mid");
        
        barrier ftop  = new barrier(Color.BLACK,600,0,30,205,"rigth-top");
        barrier door = new barrier(Color.BLACK,610,205,10,45,"rigth-down");
        
        Mapa1.getMisElementos().add(uno);
        Mapa1.getMisElementos().add(dos);
        Mapa1.getMisElementos().add(ultimo);
        Mapa1.getMisElementos().add(penultimo); 
        Mapa1.getMisElementos().add(ctop);
        Mapa1.getMisElementos().add(cright);
        Mapa1.getMisElementos().add(cleft);
        Mapa1.getMisElementos().add(cdown);
        Mapa1.getMisElementos().add(mtop);
        Mapa1.getMisElementos().add(mdown);
        Mapa1.getMisElementos().add(mmid);
        Mapa1.getMisElementos().add(ftop);
        Mapa1.getMisElementos().add(door);
    }
    public void muros_inferior(mapa Mapa1){
        
        barrier dosuno = new barrier(Color.BLACK,0,265,50,110,"left");
        barrier dosdos  = new barrier(Color.BLACK,0,420,50,80,"left");
        
        barrier dosultimo = new barrier(Color.BLACK,750,265,50,90,"rigth");
        barrier dospenultimo  = new barrier(Color.BLACK,750,400,50,100,"rigth");
        
        barrier dosctop = new barrier(Color.BLACK,95,345,105,30,"top-down");
        barrier doscright = new barrier(Color.BLACK,170,310,30,60,"rigth");
        barrier doscleft = new barrier(Color.BLACK,95,310,30,60,"left");
        barrier doscdown = new barrier(Color.BLACK,95,420,105,30,"down");
        
        barrier dosmtop  = new barrier(Color.BLACK,245,245,30,130,"rigth-top");
        barrier dosmdown  = new barrier(Color.BLACK,245,420,30,80,"rigth-down");
        
        barrier dosmmid  = new barrier(Color.BLACK,320,310,80,140,"mid");
        
        barrier dosftop  = new barrier(Color.BLACK,600,250,30,205,"rigth-top");
        barrier dosdoor = new barrier(Color.BLACK,610,455,10,45,"rigth-down");
        
        Mapa1.getMisElementos().add(dosuno);
        Mapa1.getMisElementos().add(dosdos);
        Mapa1.getMisElementos().add(dosultimo);
        Mapa1.getMisElementos().add(dospenultimo);
        Mapa1.getMisElementos().add(dosctop);
        Mapa1.getMisElementos().add(doscright);
        Mapa1.getMisElementos().add(doscleft);
        Mapa1.getMisElementos().add(doscdown);
        Mapa1.getMisElementos().add(dosmtop);
        Mapa1.getMisElementos().add(dosmdown);
        Mapa1.getMisElementos().add(dosmmid);
        Mapa1.getMisElementos().add(dosftop);
        Mapa1.getMisElementos().add(dosdoor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo1 = new juco_game.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lienzo1.setBackground(new java.awt.Color(204, 204, 204));
        lienzo1.setPreferredSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        this.setFocusable(true);
        if(evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W'){
           this.newPlayer.setY(this.newPlayer.getY()-5);
        }
        if(evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A'){
           this.newPlayer.setX(this.newPlayer.getX()-5);
        }
        if(evt.getKeyChar() == 's' || evt.getKeyChar() == 'S'){
           this.newPlayer.setY(this.newPlayer.getY()+5);
        }
        if(evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D'){
           this.newPlayer.setX(this.newPlayer.getX()+5);
        }
        if(evt.getExtendedKeyCode() == KeyEvent.VK_UP){
           this.newPlayer2.setY(this.newPlayer2.getY()-5);
        }
        if(evt.getExtendedKeyCode() == KeyEvent.VK_LEFT){
           this.newPlayer2.setX(this.newPlayer2.getX()-5);
        }
        if(evt.getExtendedKeyCode() == KeyEvent.VK_DOWN){
           this.newPlayer2.setY(this.newPlayer2.getY()+5);
        }
        if(evt.getExtendedKeyCode() == KeyEvent.VK_RIGHT){
           this.newPlayer2.setX(this.newPlayer2.getX()+5);
        } 
    }//GEN-LAST:event_formKeyPressed
    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private juco_game.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
