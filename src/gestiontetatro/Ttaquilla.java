/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import java.util.Iterator;

/**
 *
 * @author Cecilia
 * clase creada para la creación y acceso de los trabajadores del tipo taquilleros
 */
public class Ttaquilla extends Trabajador{
    
    private int idTaquilla;
   
          
    
    public Ttaquilla(int idTaquilla, String NIF, String nombre, String apellidos, String telefono, String direccion, int año1, int mes1, int dia1, int año2, int mes2, int dia2) throws ValidarTelefono {
        super(NIF, nombre, apellidos, telefono, direccion, año1, mes1, dia1, año2, mes2, dia2);
        this.idTaquilla = idTaquilla;
    }

    public Ttaquilla() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Ttaquilla{" + "idTaquilla=" + idTaquilla + '}';
    }
    
   //falta poner el nombre de la colecciÃ³n de entradas 
    
    /**
     * Función que nos permite efectuar la venta de una entrada y la elimina de las entradas disponibles para esa obra
     * @param idObra identificador de la obra para la que queremos entradas
     * @param cantidad número de entradas que queremos comprar
     * @param obrat ArrayList con todas las obras disponibles en el teatro
     */
    public void vendeEntrada(int idObra, int cantidad, Obra obrat){
        
       if(obrat.getIdObra()==idObra){
            for(int i=cantidad; i>0; i--){
                obrat.entradas.removeLast();
            }
            System.out.println(obrat.entradas.size());
            System.out.println("Entradas vendidas correctamente");
        }
        else{
            System.out.println("No se pueden vender las entradas, no hay suficientes o no coincide el id");
        }
    }
}
