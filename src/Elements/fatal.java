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

    public fatal(boolean Horizontal,boolean vertical, String ruta, int x, int y, int ancho, int alto, String id) {
        super(ruta, x, y, ancho, alto, id);
        this.Horizontal = Horizontal;
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
    

}
