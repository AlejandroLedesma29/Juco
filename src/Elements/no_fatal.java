/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

/**
 *
 * @author girveos
 */
public class no_fatal extends Image{
    private int cantidad_daño;

    public no_fatal(int cantidad_daño, String ruta, double x, double y, int ancho, int alto, double area, String id) {
        super(ruta, x, y, ancho, alto, area, id);
        this.cantidad_daño = cantidad_daño;
    }

    public no_fatal() {
        super(null, 0, 0, 0, 0, 0, null);
    }

   
     

    /**
     * @return the cantidad_daño
     */
    public int getCantidad_daño() {
        return cantidad_daño;
    }

    /**
     * @param cantidad_daño the cantidad_daño to set
     */
    public void setCantidad_daño(int cantidad_daño) {
        this.cantidad_daño = cantidad_daño;
    }
    
    
}
