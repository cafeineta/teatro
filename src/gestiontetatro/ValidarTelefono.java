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
