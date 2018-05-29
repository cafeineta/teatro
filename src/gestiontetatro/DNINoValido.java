/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

/**
 *
 * @author CristinaBlanMen
 */
public class DNINoValido extends Exception{

    public DNINoValido() {
        super("El DNI introducido es incorrecto");
    }
    /**
     * Función que comprueba que el DNI introducido sea correcto
     * 8-numeros 1-letra
     * @param dni parametro introducido en el constructor del objeto
     * @return si el valido o no el DNI
     * @throws DNINoValido si el valor del DNI es incorrecto
     */
   static  public boolean dniNo(String dni) throws DNINoValido{
       boolean solucion=true; 
       char letras; //1
        int longitud=dni.length();
        if(longitud==9){
            for (int i = 0; i < longitud-1; i++) {
                if(dni.charAt(i)>=48 && dni.charAt(i)<=57){
                
                }else{
                    solucion=false;
                    throw new DNINoValido();
                    }            
            }        
            letras=dni.charAt(longitud-1);
            if( letras>=65 && letras<=90 || letras>=97 && letras<=122) {

            } else{
                solucion=false;
                throw new DNINoValido();
                }
        }else{
            solucion=false;
            throw new DNINoValido();
        }
        return solucion;
        
        
    }
}
