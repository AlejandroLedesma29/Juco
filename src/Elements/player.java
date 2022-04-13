/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

import java.awt.Rectangle;

/**
 *
 * @author girveos
 */
public class player extends Images{
    private int nivel_aire;
    private int[]respawn = new int[2];
    private boolean moverArriba = false;
    private boolean moverAbajo = false;
    private boolean moverIzquierda = false;
    private boolean moverDerecha = false;

    public player(int nivel_aire, String ruta, int x, int y, int ancho, int alto, String id) {
        super(ruta, x, y, ancho, alto, id);
        this.nivel_aire = nivel_aire;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
        this.respawn[0] = x;
        this.respawn[1] = y;
    }

    
    /**
     * @return the nivel_aire
     */
    public int getNivel_aire() {
        return nivel_aire;
    }

    /**
     * @param nivel_aire the nivel_aire to set
     */
    public void setNivel_aire(int nivel_aire) {
        this.nivel_aire = nivel_aire;
    }

    /**
     * @return the moverArriba
     */
    public boolean isMoverArriba() {
        return moverArriba;
    }

    /**
     * @param moverArriba the moverArriba to set
     */
    public void setMoverArriba(boolean moverArriba) {
        this.moverArriba = moverArriba;
    }

    /**
     * @return the moverAbajo
     */
    public boolean isMoverAbajo() {
        return moverAbajo;
    }

    /**
     * @param moverAbajo the moverAbajo to set
     */
    public void setMoverAbajo(boolean moverAbajo) {
        this.moverAbajo = moverAbajo;
    }

    /**
     * @return the moverIzquierda
     */
    public boolean isMoverIzquierda() {
        return moverIzquierda;
    }

    /**
     * @param moverIzquierda the moverIzquierda to set
     */
    public void setMoverIzquierda(boolean moverIzquierda) {
        this.moverIzquierda = moverIzquierda;
    }

    /**
     * @return the moverDerecha
     */
    public boolean isMoverDerecha() {
        return moverDerecha;
    }

    /**
     * @param moverDerecha the moverDerecha to set
     */
    public void setMoverDerecha(boolean moverDerecha) {
        this.moverDerecha = moverDerecha;
    }
    
    public void subir(){
        this.setY(this.getY()-1);
    }
    
    public void bajar(){
        this.setY(this.getY()+1);
    }
    
    public void derecha(){
        this.setX(this.getX()+1);
    }
    
    @Override
    public void actualizarArea() {
        Rectangle area = new Rectangle(this.getX(), this.getY(), this.getAncho(), this.getAlto());
        this.setArea(area);
    }
    
    
    public void izquierda(){
        this.setX(this.getX()-1);
    }

    /**
     * @return the respawn
     */
    public int[] getRespawn() {
        return respawn;
    }

    /**
     * @param respawn the respawn to set
     */
    public void setRespawn(int[] respawn) {
        this.respawn = respawn;
    }

}
