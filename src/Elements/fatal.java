/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author girveos
 */
public class fatal extends Images{
    private boolean horizontal;
    private boolean adelante;
    
    public fatal(boolean horizontal, boolean adelante,String ruta, int x, int y, int ancho, int alto, String id) {
        super(ruta, x, y, ancho, alto, id);
        this.horizontal = horizontal;
        this.adelante = adelante;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
    }

    
    @Override
    public void actualizarArea() {
        Rectangle area = new Rectangle(this.getX(), this.getY(), this.getAncho(), this.getAlto());
        this.setArea(area);
    }

    /**
     * @return the horizontal
     */
    public boolean isHorizontal() {
        return horizontal;
    }

    /**
     * @param horizontal the horizontal to set
     */
    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    /**
     * @return the adelante
     */
    public boolean isAdelante() {
        return adelante;
    }

    /**
     * @param adelante the adelante to set
     */
    public void setAdelante(boolean adelante) {
        this.adelante = adelante;
    }
    

}
