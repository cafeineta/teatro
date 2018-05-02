/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

/**
 *
 * @author david
 */
public class Tlimpieza extends Trabajador{
    
    private int idLimpieza;

    public Tlimpieza(int idLimpieza, String NIF, String nombre, String apellidos, String telefono, String direccion, int año1, int mes1, int dia1, int año2, int mes2, int dia2) {
        super(NIF, nombre, apellidos, telefono, direccion, año1, mes1, dia1, año2, mes2, dia2);
        this.idLimpieza = idLimpieza;
    }

    public Tlimpieza() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Tlimpieza{" + "idLimpieza=" + idLimpieza + '}';
    }
    
    
}
