/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

/**
 *
 * @author girveos
 */
public class player extends Image {
    private int nivel_aire;

    public player(int nivel_aire, String ruta, double x, double y, int ancho, int alto, double area, String id) {
        super(ruta, x, y, ancho, alto, area, id);
        this.nivel_aire = nivel_aire;
    }

    public player() {
        super(null, 0, 0, 0, 0, 0, null);
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
