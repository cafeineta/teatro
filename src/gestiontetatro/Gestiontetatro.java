
package gestiontetatro;

/**
 *
 * @author DAW112
 */
public class Gestiontetatro {

    
    
    
    public static void main(String[] args) throws ValidarDNI, ValidarTelefono {
     try{
         Cliente c1= new Cliente("72208088W","cris","blanco","email",'T');
        Obra obra=new Obra(1,"hola","comedia","español",true,10);
        c1.compraEntrada(1, 5, obra);
        Trabajador t1=new Trabajador("dni","yo","tu","676064079","direc",2017,01,04,2000,01,04);
     }
     catch(ValidarDNI e){
         System.out.println("ERROR al introducir el DNI");
         e.printStackTrace();
     }
     catch(ValidarTelefono e){
         System.out.println("error tele");
         e.printStackTrace();
     }
        
        
        
       
    }
    
}
