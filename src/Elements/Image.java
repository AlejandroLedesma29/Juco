/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elements;

/**
 *
 * @author L E D E S M A
 */
public abstract class Image extends element{
    private String ruta;

    public Image(String ruta, double x, double y, int ancho, int alto, double area, String id) {
        super(x, y, ancho, alto, area, id);
        this.ruta = ruta;
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
