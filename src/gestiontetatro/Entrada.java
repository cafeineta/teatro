/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import java.util.Calendar;

/**
 *
 * @author DAW112
 */
public class Entrada {
    private int identrda;
    private Calendar fechacompra;
    private double precio;

    public Entrada() {
    }

    public Entrada(int identrda, Calendar fechacompra, double precio) {
       this.identrda = identrda;
        this.fechacompra = fechacompra;
        this.precio = precio;
    }

    public int getIdentrda() {
        return identrda;
    }

    public void setIdentrda(int identrda) {
        this.identrda = identrda;
    }
    
    
    
}
