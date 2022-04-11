/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

/**
 *
 * @author girveos
 */
public class healing extends element{
    private int cantidad_aumento;

    public healing(int cantidad_aumento, double x, double y, int lado, double area, String id) {
        super(x, y, lado, area, id);
        this.cantidad_aumento = cantidad_aumento;
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
