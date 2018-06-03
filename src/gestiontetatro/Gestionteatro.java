
package gestiontetatro;

/**
 *
 * @author DAW112
 */
public class Gestionteatro {

    
    
    
    public static void main(String[] args) throws ValidarDNI, ValidarTelefono {
     try{
         Cliente c1= new Cliente("72208088W","cris","blanco","email",'T');
        Obra obra=new Obra(1,"hola","comedia","español",true,10);
        c1.compraEntrada(1, 5, obra);
        Trabajador t1=new Trabajador("dni","yo","tu","676064079","direc",2017,1,4,2000,1,4);
        System.out.println(t1.getFechaNacimiento());
     }catch (NullPointerException ex){
         System.out.println("no hay fecha");
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
