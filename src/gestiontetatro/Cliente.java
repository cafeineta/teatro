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
    
    public Cliente(){
        
    }
    
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
    
    /**
     * funcion que realiza la compra de una entrada, si el Id de la Obra coincide con el de la obra podida por el cliente, y hay entradas suficientes, deberia permitir la compra de estas
     * @param idObra identificador de la Obra
     * @param cantidad contidad de entradas requeridas por el cliente
     * @param obrat Objeto Obra del que necesitamos obtenr metodos
     */
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
    /**
     * hace practicamente la misma funcion que comprar entradas
     * @param idObra
     * @param cantidad
     * @param obrat 
     */
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
                 System.out.println("No quedan entradas disponibles o no coincide el id de entrada");
                            }
    }
}
