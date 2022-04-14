/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

import java.awt.Rectangle;

/**
 *
 * @author L E D E S M A
 */
public class key extends Images{

    public key(String ruta, int x, int y, int ancho, int alto, String id) {
        super(ruta, x, y, ancho, alto, id);
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
    }

    @Override
    public void actualizarArea() {
        
    }
    
}
