/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elements;

import java.util.LinkedList;

/**
 *
 * @author girveos
 */
public class lienzo {
    private int largo;
    private int ancho;
    private LinkedList <mapa> misMapas;

    public lienzo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        misMapas = new LinkedList<>();
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
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the misMapas
     */
    public LinkedList <mapa> getMisMapas() {
        return misMapas;
    }

    /**
     * @param misMapas the misMapas to set
     */
    public void setMisMapas(LinkedList <mapa> misMapas) {
        this.misMapas = misMapas;
    }
    
}
