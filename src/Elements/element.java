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
public abstract class element {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Rectangle Area;
    private String id;

    public element(int x, int y, int ancho, int alto, String id) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.id = id;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * @return the Area
     */
    public Rectangle getArea() {
        return Area;
    }

    /**
     * @param Area the Area to set
     */
    public void setArea(Rectangle Area) {
        this.Area = Area;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
