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
public class barrier extends element{
    private Color color;

    public barrier(Color color, int x, int y, int ancho, int alto, String id) {
        super(x, y, ancho, alto, id);
        this.color = color;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
 @Override
    public void actualizarArea() {
        Rectangle area = new Rectangle(this.getX(), this.getY(), this.getAncho(), this.getAlto());
        this.setArea(area);
    }
    
    
    
    

    
    
}
