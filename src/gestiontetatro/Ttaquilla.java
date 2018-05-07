/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import java.util.Iterator;

/**
 *
 * @author david
 */
public class Ttaquilla extends Trabajador{
    
    private int idTaquilla;

    public Ttaquilla(int idTaquilla, String NIF, String nombre, String apellidos, String telefono, String direccion, int año1, int mes1, int dia1, int año2, int mes2, int dia2) {
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
    public void vendeEntrada(int id, int cantidad, Entrada coleccion){
        
       
           
              Iterator borrar  = coleccion.iterator(); //si no borra mira aqui
             if(object.getID()==id && object.getnumEntradas()>=cantidad){
                while(cantidad>0){    
                    while (borrar.hasNext()){
                        Entrada et = (Entrada)borrar.next();
                        
                            
                                 cantidad--;
                                 coleccion.remove(et);
                    }
                           
                }
            }
        else{
                 System.out.println("no quedan entradas disponibles o no ocincide el id de entrada");
                            }
    }
}
