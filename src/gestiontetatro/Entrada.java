/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import static gestiontetatro.ValidarFecha.validaDia;
import static gestiontetatro.ValidarFecha.validaMes;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author DAW112
 */
public class Entrada {
    private int identrada;
    private Calendar fechacompra=Calendar.getInstance();
    private double precio;

    public Entrada() {
    }

    public Entrada(int identrada, int a, int m, int d, double precio) throws ValidarFecha {
       this.identrada = identrada;
       int diaval=validaDia(d);
       int mesval=validaMes(m);
        this.fechacompra.set(a, mesval, diaval);
        this.precio = precio;
    }
    
    /**
     * Función que transforma la fecha dada por el sistema al formato dia/mes/año
     * @return la fecha en el formato indicado anteriormente
     */
    public String formatoFechaNaci(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MMMMM/yyyy");
        
        return sdf.format(this.fechacompra.getTime());
    }

    public int getIdentrda() {
        return identrada;
    }

    public void setIdentrada(int identrada) {
        this.identrada = identrada;
    }
    
    
    
}
