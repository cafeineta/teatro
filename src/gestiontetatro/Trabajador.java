/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import java.util.Calendar;

/**
 *
 * @author david
 */
public class Trabajador {
    
    private String NIF, nombre, apellidos, telefono, direccion;
    private Calendar fechaNacimiento, fechaIngreso;

    public Trabajador(String NIF, String nombre, String apellidos, String telefono, String direccion, int año1, int mes1, int dia1, int año2, int mes2, int dia2) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento.set(año1, mes1, dia1);
        this.fechaIngreso.set(año2, mes2, dia2);
    }

    public Trabajador() {
    }

    @Override
    public String toString() {
        return "Trabajador{" + "NIF=" + NIF + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
}
