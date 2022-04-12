/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

/**
 *
 * @author girveos
 */
public class healing extends Image{
    private int cantidad_aumento;

    public healing(int cantidad_aumento, String ruta, double x, double y, int ancho, int alto, double area, String id) {
        super(ruta, x, y, ancho, alto, area, id);
        this.cantidad_aumento = cantidad_aumento;
    }

    public healing() {
        super(null, 0, 0, 0, 0, 0, null);
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
