/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

/**
 *
 * @author girveos
 */
public class air_bar  {
    private int alto;
    private int largo;
    private int cantidad_disminucion;
    private player miJugador;

    public air_bar(int alto, int largo, int cantidad_disminucion) {
        this.alto = alto;
        this.largo = largo;
        this.cantidad_disminucion = cantidad_disminucion;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * @return the cantidad_disminucion
     */
    public int getCantidad_disminucion() {
        return cantidad_disminucion;
    }

    /**
     * @param cantidad_disminucion the cantidad_disminucion to set
     */
    public void setCantidad_disminucion(int cantidad_disminucion) {
        this.cantidad_disminucion = cantidad_disminucion;
    }

    /**
     * @return the miJugador
     */
    public player getMiJugador() {
        return miJugador;
    }

    /**
     * @param miJugador the miJugador to set
     */
    public void setMiJugador(player miJugador) {
        this.miJugador = miJugador;
    }
    
    
}
