
package gestiontetatro;

/**
 *
 * @author DAW112
 */
public class Gestiontetatro {

    
    
    
    public static void main(String[] args) {
     
        Cliente c1= new Cliente("dni","cris","blanco","email",'T');
        Obra obra=new Obra(1,"hola","comedia","español",true,10);
        
        
        c1.compraEntrada(1, 5, obra);
    }
    
}
