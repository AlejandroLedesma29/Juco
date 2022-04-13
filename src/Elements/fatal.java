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
    private boolean Horizontal;
    private boolean vertical;
    private boolean Adelante;

    public fatal(boolean Horizontal,boolean vertical,boolean Adelante, String ruta, int x, int y, int ancho, int alto, String id) {
        super(ruta, x, y, ancho, alto, id);
        this.Horizontal = Horizontal;
        this.Adelante = Adelante;
        this.vertical = vertical;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
    }

 
    @Override
    public void actualizarArea() {
        Rectangle area = new Rectangle(this.getX(), this.getY(), this.getAncho(), this.getAlto());
        this.setArea(area);
    }

    /**
     * @return the Horizontal
     */
    public boolean isHorizontal() {
        return Horizontal;
    }

    /**
     * @param Horizontal the Horizontal to set
     */
    public void setHorizontal(boolean Horizontal) {
        this.Horizontal = Horizontal;
    }

    /**
     * @return the vertical
     */
    public boolean isVertical() {
        return vertical;
    }

    /**
     * @param vertical the vertical to set
     */
    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

    /**
     * @return the Adelante
     */
    public boolean isAdelante() {
        return Adelante;
    }

    /**
     * @param Adelante the Adelante to set
     */
    public void setAdelante(boolean Adelante) {
        this.Adelante = Adelante;
    }
    

}
