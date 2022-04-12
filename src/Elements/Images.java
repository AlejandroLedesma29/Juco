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
public abstract class Images extends element{
    private String ruta;

    public Images(String ruta, int x, int y, int ancho, int alto, String id) {
        super(x, y, ancho, alto, id);
        this.ruta = ruta;
        Rectangle area = new Rectangle(x, y, ancho,alto);
        this.setArea(area);
    }

    
    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    

    }

    


