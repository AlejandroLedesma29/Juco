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
public class mapa {
    private String id;
    private LinkedList<element>misElementos;

    public mapa(String id) {
        this.id = id;
        misElementos = new LinkedList<>();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the misElementos
     */
    public LinkedList<element> getMisElementos() {
        return misElementos;
    }

    /**
     * @param misElementos the misElementos to set
     */
    public void setMisElementos(LinkedList<element> misElementos) {
        this.misElementos = misElementos;
    }
    
}
