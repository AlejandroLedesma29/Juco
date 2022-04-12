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
public class player extends Images {
    private int nivel_aire;

    public player(int nivel_aire, String ruta, int x, int y, int ancho, int alto, String id) {
        super(ruta, x, y, ancho, alto, id);
        this.nivel_aire = nivel_aire;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
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
    
}
