/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import static gestiontetatro.ValidarDNI.dniNo;
import java.util.Iterator;

/**
 *
 * @author DAW112
 */
public class Cliente {
    
    private String NIF;
    private String nombre;
    private String apellidos;
    private String email;
    private char metodopago;

    public Cliente(String NIF, String nombre, String apellidos, String email, char metodopago) throws ValidarDNI {
        
        try{
             if(dniNo(NIF)==true){ 
                     this.nombre = nombre;
                     this.apellidos = apellidos;
                     this.email = email;
                     this.metodopago = metodopago;               
                     this.NIF=NIF;
                }
                else{
                    
                }
               
            
            
        }
        catch(ValidarDNI e){
            System.out.println("Se ha producido una excepcion en el DNI");
            e.printStackTrace();
        }
    }
    
    
    public void compraEntrada(int idObra, int cantidad, Obra obrat){
        if(obrat.getIdObra()==idObra){
            for(int i=cantidad; i>0; i--){
                obrat.entradas.removeLast();
            }
            System.out.println(obrat.entradas.size());
            System.out.println("Entradas compradas correctamente");
        }
        else{
            System.out.println("No se pueden realizar las entradas, no hay suficiente no coincide el id");
        }
       
    }
    
    public void reservaEntradas (int idObra, int cantidad, Obra obrat){
                 Iterator borrar  = obrat.entradas.iterator(); //si no borra mira aqui
             if((obrat.getIdObra()==idObra) && (obrat.getnumentradas())>= cantidad){
                while(cantidad>0){    
                    while (borrar.hasNext()){
                        Entrada et = (Entrada)borrar.next();
                        
                            
                                 cantidad--;
                                 obrat.entradas.remove(et);
                                
                    }
                           
                }
                 System.out.println("Sus entradas han quedado reservadas");
            }
        else{
                 System.out.println("no quedan entradas disponibles o no coincide el id de entrada");
                            }
    }
}
