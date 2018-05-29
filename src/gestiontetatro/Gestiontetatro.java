
package gestiontetatro;

/**
 *
 * @author DAW112
 */
public class Gestiontetatro {

    
    
    
    public static void main(String[] args) throws DNINoValido {
     try{
         Cliente c1= new Cliente("72208088Wh","cris","blanco","email",'T');
        Obra obra=new Obra(1,"hola","comedia","español",true,10);
        c1.compraEntrada(1, 5, obra);
     }
     catch(DNINoValido e){
         System.out.println("ERROR al introducir el DNI");
         e.printStackTrace();
     }
        
        
        
       
    }
    
}
