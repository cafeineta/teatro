/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

/**
 *
 * @author F541
 */
public class ValidarTelefono extends Exception{

    public ValidarTelefono() {
        super("Telefono introducido incorrecto");
    }
    /**
     * metdodo que valida que el numero de telefono sea correcto, si no lo es deberia lanzar la excepcion y notificarlo adecuadamente
     * @param tele es el numero de telefono a evaluar por el metodo
     * @return si el telefono es adecuado retornara el telefono cargado en el String bueno
     * @throws ValidarTelefono 
     */
    public static String validaTel(String tele) throws ValidarTelefono{
        String bueno = null;
  
            int longitud=tele.length();
            if(longitud==9){
                
                for (int i = 0; i < longitud; i++) {
                    if(tele.charAt(i)>=48 && tele.charAt(i)<=57){
                        bueno=bueno+tele.charAt(i);
                    }
                    else{
                        throw new ValidarTelefono();
                    }
                }
            }
        return bueno;
    }
    
     
}
