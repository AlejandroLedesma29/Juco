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
public class healing extends Images{
    private int cantidad_aumento;

    public healing(int cantidad_aumento, String ruta, int x, int y, int ancho, int alto, String id) {
        super(ruta, x, y, ancho, alto, id);
        this.cantidad_aumento = cantidad_aumento;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
    }

    
    

    

    /**
     * @return the cantidad_aumento
     */
    public int getCantidad_aumento() {
        return cantidad_aumento;
    }

    /**
     * @param cantidad_aumento the cantidad_aumento to set
     */
    public void setCantidad_aumento(int cantidad_aumento) {
        this.cantidad_aumento = cantidad_aumento;
    }
    
    
}
