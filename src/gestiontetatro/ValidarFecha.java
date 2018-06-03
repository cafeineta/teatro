/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import java.util.Scanner;

/**
 *
 * @author Ceciliaherrero
 */
public class ValidarFecha extends Exception{
    
    
    public ValidarFecha(){
        super("La fecha introducida no es válida");
        }
    
    /**
     * Función que nos permite comprobar que el día introducido para una fecha es válido
     * @param di día que hemos introducido en el constructor de la clase y queremos validar
     * @return la fecha que hemos introducido si es válida, si no lanza una excepción
     * @throws gestiontetatro.ValidarFecha 
     */
     public static int validaDia(int di) throws ValidarFecha{
         int dia=0;
      
         if(di>=1 && di<=31){
            System.out.println("BIEN HECHO");
             dia=di;
         }
         
         else{
            throw new ValidarFecha();
         }
         
         return dia;
     }
    
     /**
     * Función que nos permite comprobar que el mes introducido para una fecha es válido
     * @param me mes que hemos introducido en el constructor de la clase y queremos validar
     * @return el mes que hemos introducido si es válida, si no lanza una excepción
     * @throws gestiontetatro.ValidarFecha 
     */
    public static int validaMes (int me) throws ValidarFecha{
        int mes=0;
            
        if(me>=1 && me<=12){
            System.out.println("BIEN HECHO");
            mes=me;
        }
        else{
           
            throw new ValidarFecha();
        }
            return mes;
            }     
        
}
      

