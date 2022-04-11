/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

/**
 *
 * @author girveos
 */
public class no_fatal extends element{
    private int cantidad_daño;

    public no_fatal(int cantidad_daño, double x, double y, int lado, double area, String id) {
        super(x, y, lado, area, id);
        this.cantidad_daño = cantidad_daño;
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
