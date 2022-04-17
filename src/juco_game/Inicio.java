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
import Elements.fatal;
import Elements.healing;
import Elements.no_fatal;
import Elements.key;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;


/**
 *
 * @author L E D E S M A
 */
public class Inicio extends javax.swing.JFrame implements KeyListener{
    player newPlayer;
    player newPlayer2;
    Thread proceso;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
        mapa Mapa1 = new mapa("001");
        int daño = 10;
        //Dibujar chuzos parte de abajo
        dibujarChuzozAAbajo1(daño,Mapa1);
        dibujarChuzozAAbajo2(daño,Mapa1);
        dibujarChuzozAAbajo3(daño,Mapa1);
        dibujarChuzozAAbajo4(daño,Mapa1);
        dibujarChuzozAAbajo5(daño,Mapa1);
        dibujarChuzozAAbajo6(daño,Mapa1);
        dibujarChuzozAAbajo7(daño,Mapa1);
        
        //Creacion de chuzos
        creacion_chuzos(daño,"src/pictures/chuzo.png",Mapa1,"src/pictures/chuzo2.png");
        //Creacion bordes mapa
        bordes_mapa(Mapa1);
        //Creacion de muros primera parte     
        muros_superior(Mapa1);
        //Creacion de muros segunda parte
        muros_inferior(Mapa1);
        //
        crear_balas(Mapa1);
        //Creacion de llaves
        key llave1 = new key("src/pictures/llave.png", 495, 130, 20, 20,"llaveArriba");
        key llave2 = new key("src/pictures/llave.png", 495, 378, 20, 20,"llaveAbajo");
        Mapa1.getMisElementos().add(llave1);
        Mapa1.getMisElementos().add(llave2);
        
        //Creacion fatales bajos
        crearFatalesAbajo(Mapa1);
        crearFatalesAribba(Mapa1);
        
        //Creacion proteccion llaves
        proteccion_llaves_arriba(Mapa1);
        proteccion_llaves_abajo(Mapa1);
        
        //crear puntos de salud
        healing curaBaja = new healing(100, "src/pictures/cura.png", 138, 315, 20, 20,"cura_abajo");
        healing curaalta = new healing(100, "src/pictures/cura.png", 138, 70, 20, 20,"cura_arriba");
        Mapa1.getMisElementos().add(curaBaja);
        Mapa1.getMisElementos().add(curaalta);
        
        
        //Creacion de jugadores
        this.newPlayer = new player(200,"src/pictures/bola1.png",25,140,18,18,"Jugador 1");
        Mapa1.getMisElementos().add(this.newPlayer);
        
        this.newPlayer2 = new player(200,"src/pictures/bola2.png",25,388,18,18,"Jugador 2");
        Mapa1.getMisElementos().add(this.newPlayer2);
        
        lienzo1.setMiMapa(Mapa1);
        proceso = new Thread(lienzo1);
        this.lienzo1.setActivo(true);
        this.lienzo1.sound("src/sounds/song_game.wav");
        Empezarbtn.setEnabled(false);
        proceso.start();
        
    }
    
    public void proteccion_llaves_arriba(mapa Mapa1){
        for(int i = 445;i < 545 ;i += 25){
        fatal f1 = new  fatal(true,false, true,"src/pictures/bomba.png", i, 95,15,15,"bomba");
        fatal f2 = new  fatal(true,false, true,"src/pictures/bomba.png", i, 170,15,15,"bomba");
        Mapa1.getMisElementos().add(f1);
        Mapa1.getMisElementos().add(f2);
        }
        fatal f1 = new  fatal(true,false, true,"src/pictures/bomba.png", 445, 120,15,15,"bomba");
        fatal f2 = new  fatal(true,false, true,"src/pictures/bomba.png", 445, 145,15,15,"bomba");
        Mapa1.getMisElementos().add(f1);
        Mapa1.getMisElementos().add(f2);
        
       
    }
    public void proteccion_llaves_abajo(mapa Mapa1){
        for(int i = 445;i < 545 ;i += 25){
        fatal f1 = new  fatal(true,false, true,"src/pictures/bomba.png", i, 343,15,15,"bomba");
        fatal f2 = new  fatal(true,false, true,"src/pictures/bomba.png", i, 418,15,15,"bomba");
        Mapa1.getMisElementos().add(f1);
        Mapa1.getMisElementos().add(f2);
        }
        fatal f1 = new  fatal(true,false, true,"src/pictures/bomba.png", 445, 368,15,15,"bomba");
        fatal f2 = new  fatal(true,false, true,"src/pictures/bomba.png", 445, 393,15,15,"bomba");
        Mapa1.getMisElementos().add(f1);
        Mapa1.getMisElementos().add(f2);
       
    }
    public void crearFatalesAribba(mapa Mapa1){
        //Creacion fatales
        fatal f1 = new  fatal(true,false, true,"src/pictures/bomba.png", 280,25,15,15,"bomba");
        fatal f2 = new  fatal(true,false, false,"src/pictures/bomba.png", 420,45,15,15,"bomba");
        fatal f3 = new  fatal(false,true, true,"src/pictures/bomba.png", 280,65,15,15,"bomba");
        fatal f4 = new  fatal(false,true, false,"src/pictures/bomba.png", 300,190,15,15,"bomba");
        fatal f5 = new  fatal(true,false, true,"src/pictures/bomba.png", 280,210,15,15,"bomba");
        fatal f6 = new  fatal(true,false, false,"src/pictures/bomba.png", 420,230,15,15,"bomba");
        Mapa1.getMisElementos().add(f1);
        Mapa1.getMisElementos().add(f2);
        Mapa1.getMisElementos().add(f3);
        Mapa1.getMisElementos().add(f4);
        Mapa1.getMisElementos().add(f5);
        Mapa1.getMisElementos().add(f6);
    }
    public void crearFatalesAbajo(mapa Mapa1){
          //Creacion fatales
        fatal f1 = new  fatal(true,false,false, "src/pictures/bolaChuzos.png",280,268,15,15,"horizontal");
        fatal f2 = new  fatal(true,false,false, "src/pictures/bolaChuzos.png",420,294,15,15,"horizontal");
        fatal f3 = new  fatal(true,false,false, "src/pictures/bolaChuzos.png",280,455,15,15,"horizontal");
        fatal f4 = new  fatal(true,false,false, "src/pictures/bolaChuzos.png",420,485,15,15,"horizontal");
        //Creacion fatales 
        fatal f5 = new  fatal(true,false,false, "src/pictures/bolaChuzos.png",280, 308,15,15,"vertical");
        fatal f6 = new  fatal(true,false,false, "src/pictures/bolaChuzos.png",300,435,15,15,"vertical");
        
        
        Mapa1.getMisElementos().add(f1);
        Mapa1.getMisElementos().add(f2);
        Mapa1.getMisElementos().add(f3);
        Mapa1.getMisElementos().add(f4);
        Mapa1.getMisElementos().add(f5);
        Mapa1.getMisElementos().add(f6);
    }
    public void creacion_chuzos(int daño,String ruta1,mapa Mapa1,String ruta2){
        int i = 51;
        int p = 0;
        while(i<=227){
            no_fatal c1 = new no_fatal(daño,ruta1,i,240,20,20,"chuzo");
            Mapa1.getMisElementos().add(c1);
            
            no_fatal c2 = new no_fatal(daño,ruta2,i,10,20,20,"chuzo");
            Mapa1.getMisElementos().add(c2);
            
            p = chuzos_escalones(daño,i, p, ruta1, Mapa1,ruta2);
            i+=7;
        }
    }
    public int chuzos_escalones (int daño,int i,int p,String ruta1,mapa Mapa1,String ruta2){
        if(i>=93 && i <= 190){
                if(p<3){
                    no_fatal c2 = new no_fatal(daño,ruta1,i,55,20,30,"chuzo");
                    Mapa1.getMisElementos().add(c2);
                }
                if(p>=3 && p<10){
                    no_fatal c2 = new no_fatal(daño,ruta1,i,90,20,30,"chuzo");
                    Mapa1.getMisElementos().add(c2);
                }
                if(p>=10 && p<13){
                    no_fatal c2 = new no_fatal(daño,ruta1,i+5,55,20,30,"chuzo");
                    Mapa1.getMisElementos().add(c2);
            }
                no_fatal c2 = new no_fatal(daño,ruta1,i,165,18,30,"chuzo");
                Mapa1.getMisElementos().add(c2);
                
                no_fatal c1 = new no_fatal(daño,ruta2,i,113,18,30,"chuzo");
                    Mapa1.getMisElementos().add(c1);
                p++;
            }
        return p;
    }
    public void crear_balas(mapa Mapa1){
        fatal bala1 = new fatal(false, true, false,"src/pictures/bala.png", 640, 25, 10,20 , "primera");
        fatal bala2 = new fatal(false, true, false,"src/pictures/bala.png", 670, 25, 10,20 , "segunda");
        fatal bala3 = new fatal(false, true, false,"src/pictures/bala.png", 700, 25, 10,20 , "tercera");
        fatal bala4 = new fatal(false, true, false,"src/pictures/bala.png", 730, 25, 10,20 , "cuarta");
        
        fatal Dbala1 = new fatal(false, true, false,"src/pictures/bala.png", 640, 270, 10,20 , "primera");
        fatal Dbala2 = new fatal(false, true, false,"src/pictures/bala.png", 670, 270, 10,20 , "segunda");
        fatal Dbala3 = new fatal(false, true, false,"src/pictures/bala.png", 700, 270, 10,20 , "tercera");
        fatal Dbala4 = new fatal(false, true, false,"src/pictures/bala.png", 730, 270, 10,20 , "cuarta");
        
        Mapa1.getMisElementos().add(bala1);
        Mapa1.getMisElementos().add(bala2);
        Mapa1.getMisElementos().add(bala3);
        Mapa1.getMisElementos().add(bala4);
        
        Mapa1.getMisElementos().add(Dbala1);
        Mapa1.getMisElementos().add(Dbala2);
        Mapa1.getMisElementos().add(Dbala3);
        Mapa1.getMisElementos().add(Dbala4);
        
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
        
        barrier uno = new barrier(Color.BLACK,0,0,50,125,"left");
        barrier dos  = new barrier(Color.BLACK,0,170,50,80,"left");
        
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
        barrier door = new barrier(Color.BLACK,610,205,10,45,"door_up");
        
        barrier meta = new barrier (Color.GREEN, 750,100,40,50,"meta");
        
        barrier gun1 = new barrier(Color.GRAY, 638, 10, 15,25 ,"gun_up");
        barrier gun2 = new barrier(Color.GRAY, 668, 10, 15,25 ,"gun_up");
        barrier gun3 = new barrier(Color.GRAY, 698, 10, 15,25 ,"gun_up");
        barrier gun4 = new barrier(Color.GRAY, 728, 10, 15,25 ,"gun_up");
        
        Mapa1.getMisElementos().add(meta);
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
        Mapa1.getMisElementos().add(gun1);
        Mapa1.getMisElementos().add(gun2);
        Mapa1.getMisElementos().add(gun3);
        Mapa1.getMisElementos().add(gun4);
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
        barrier dosdoor = new barrier(Color.BLACK,610,455,10,45,"door_down");
        
        barrier meta = new barrier (Color.GREEN, 750,350,40,50,"meta");
        
        barrier gun1 = new barrier(Color.GRAY, 638, 258, 15,25 ,"gun_down");
        barrier gun2 = new barrier(Color.GRAY, 668, 258, 15,25 ,"gun_down");
        barrier gun3 = new barrier(Color.GRAY, 698, 258, 15,25 ,"gun_down");
        barrier gun4 = new barrier(Color.GRAY, 728, 258, 15,25 ,"gun_down");
        
        Mapa1.getMisElementos().add(meta);
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
        Mapa1.getMisElementos().add(gun1);
        Mapa1.getMisElementos().add(gun2);
        Mapa1.getMisElementos().add(gun3);
        Mapa1.getMisElementos().add(gun4);
    }
    public void dibujarChuzozAAbajo1(int daño,mapa Mapa1){
        //Abajo del todo
        int empezarX = 43;
        int empezarY = 490;
        for (int i = 0; i < 28; i++) {
            no_fatal chuzo = new no_fatal(daño,"src/pictures/chuzo.png",empezarX, empezarY,20 ,30 ,"Chuzo");
            Mapa1.getMisElementos().add(chuzo);
            empezarX += 7; 
        }
    }
    public void dibujarChuzozAAbajo2(int daño,mapa Mapa1){
        //Arriba del todo
        int empezarX = 43;
        int empezarY = 250;
        for (int i = 0; i < 28; i++) {
            no_fatal chuzo = new no_fatal(daño,"src/pictures/chuzo2.png",empezarX, empezarY,20 ,30 ,"Chuzo");
            Mapa1.getMisElementos().add(chuzo);
            empezarX += 7; 
        }
    }
    public void dibujarChuzozAAbajo3(int daño,mapa Mapa1){
        //Arriba pequeños
        int empezarX = 93;
        int empezarY = 302;
        for (int i = 0; i < 3; i++) {
            no_fatal chuzo = new no_fatal(daño,"src/pictures/chuzo.png",empezarX, empezarY,20 ,30 ,"Chuzo");
            Mapa1.getMisElementos().add(chuzo);
            empezarX += 7; 
        }
    }
    public void dibujarChuzozAAbajo4(int daño,mapa Mapa1){
        //Arriba pequeños
        int empezarX = 170;
        int empezarY = 302;
        for (int i = 0; i < 3; i++) {
            no_fatal chuzo = new no_fatal(daño,"src/pictures/chuzo.png",empezarX, empezarY,20 ,30 ,"Chuzo");
            Mapa1.getMisElementos().add(chuzo);
            empezarX += 7; 
        }
    }
    public void dibujarChuzozAAbajo5(int daño,mapa Mapa1){
        //Medio Abajo
        int empezarX = 93;
        int empezarY = 408;
        for (int i = 0; i < 14; i++) {
            no_fatal chuzo = new no_fatal(daño,"src/pictures/chuzo.png",empezarX, empezarY,20 ,30 ,"Chuzo");
            Mapa1.getMisElementos().add(chuzo);
            empezarX += 7; 
        }
    }
    public void dibujarChuzozAAbajo6(int daño,mapa Mapa1){
        //Medio Arriba
        int empezarX = 93;
        int empezarY = 358;
        for (int i = 0; i < 14; i++) {
            no_fatal chuzo = new no_fatal(daño,"src/pictures/chuzo2.png",empezarX, empezarY,20 ,30 ,"Chuzo");
            Mapa1.getMisElementos().add(chuzo);
            empezarX += 7; 
        }
    }
    public void dibujarChuzozAAbajo7(int daño,mapa Mapa1){
        //arriba medio pequeños
        int empezarX = 125;
        int empezarY = 335;
        for (int i = 0; i < 5; i++) {
            no_fatal chuzo = new no_fatal(daño,"src/pictures/chuzo.png",empezarX, empezarY,20 ,30 ,"Chuzo");
            Mapa1.getMisElementos().add(chuzo);
            empezarX += 7; 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo1 = new juco_game.Lienzo();
        Pausabtn = new javax.swing.JButton();
        Empezarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lienzo1.setBackground(new java.awt.Color(204, 204, 204));
        lienzo1.setPreferredSize(new java.awt.Dimension(908, 600));
        lienzo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lienzo1MouseClicked(evt);
            }
        });
        lienzo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lienzo1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lienzo1KeyTyped(evt);
            }
        });

        Pausabtn.setText("Pausa");
        Pausabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausabtnActionPerformed(evt);
            }
        });

        Empezarbtn.setText("Empezar");
        Empezarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpezarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzo1Layout.createSequentialGroup()
                .addGap(828, 828, 828)
                .addGroup(lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pausabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Empezarbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzo1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(Pausabtn)
                .addGap(31, 31, 31)
                .addComponent(Empezarbtn)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        //this.setFocusable(true);
        if(evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W'){
            this.newPlayer.setY(this.newPlayer.getY()-5);
        }else if(evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A'){
           this.newPlayer.setX(this.newPlayer.getX()-5);
        }else if(evt.getKeyChar() == 's' || evt.getKeyChar() == 'S' ){
           this.newPlayer.setY(this.newPlayer.getY()+5);
        }else if(evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D'){
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

    private void PausabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausabtnActionPerformed
        // TODO add your handling code here:
        Pausabtn.setEnabled(false);
        Empezarbtn.setEnabled(true);
        this.lienzo1.detener();
        JOptionPane.showMessageDialog(null,"Pausa");
    }//GEN-LAST:event_PausabtnActionPerformed

    private void EmpezarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpezarbtnActionPerformed
        // TODO add your handling code here:
        Empezarbtn.setEnabled(false);
        Pausabtn.setEnabled(true);
        this.lienzo1.start();
    }//GEN-LAST:event_EmpezarbtnActionPerformed

    private void lienzo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lienzo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lienzo1KeyTyped

    private void lienzo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lienzo1KeyPressed
        this.setFocusable(true);
        if(evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W'){
            this.newPlayer.setY(this.newPlayer.getY()-5);
        }else if(evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A'){
           this.newPlayer.setX(this.newPlayer.getX()-5);
        }else if(evt.getKeyChar() == 's' || evt.getKeyChar() == 'S' ){
           this.newPlayer.setY(this.newPlayer.getY()+5);
        }else if(evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D'){
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
    }//GEN-LAST:event_lienzo1KeyPressed

    private void lienzo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lienzo1MouseClicked
    
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
    private javax.swing.JButton Empezarbtn;
    private javax.swing.JButton Pausabtn;
    private juco_game.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        this.setFocusable(true);
        if(evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W'){
            this.newPlayer.setY(this.newPlayer.getY()-5);
        }else if(evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A'){
           this.newPlayer.setX(this.newPlayer.getX()-5);
        }else if(evt.getKeyChar() == 's' || evt.getKeyChar() == 'S' ){
           this.newPlayer.setY(this.newPlayer.getY()+5);
        }else if(evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D'){
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
    }

    @Override
    public void keyReleased(KeyEvent evt) {
        this.setFocusable(true);
        if(evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W'){
            this.newPlayer.setY(this.newPlayer.getY()-5);
        }else if(evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A'){
           this.newPlayer.setX(this.newPlayer.getX()-5);
        }else if(evt.getKeyChar() == 's' || evt.getKeyChar() == 'S' ){
           this.newPlayer.setY(this.newPlayer.getY()+5);
        }else if(evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D'){
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
    }

}
