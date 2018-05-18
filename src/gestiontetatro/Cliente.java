/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

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

    public Cliente(String NIF, String nombre, String apellidos, String email, char metodopago) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.metodopago = metodopago;
    }
    
    
    public void compraentrada(int idObra, int cantidad, Obra obrat){
        
                 Iterator borrar  = obrat.entradas.iterator(); //si no borra mira aqui
             if((obrat.getIdObra()==idObra) && (obrat.getnumentradas())>= cantidad){
                while(cantidad>0){    
                    while (borrar.hasNext()){
                        Entrada et = (Entrada)borrar.next();
                        
                            
                                 cantidad--;
                                 obrat.entradas.remove(et);
                                 
                    }
                           
                }
                System.out.println("Ha finalizado su compra con exito");
            }
        else{
                 System.out.println("no quedan entradas disponibles o no coincide el id de entrada");
                            }
    }
    
    public void reservaentradas (int idObra, int cantidad, Obra obrat){
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
