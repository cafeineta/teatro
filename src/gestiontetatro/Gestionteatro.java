
package gestiontetatro;

/**
 *
 * @author DAW112
 */
public class Gestionteatro {

    
    
    
    public static void main(String[] args) throws ValidarDNI, ValidarTelefono {
     try{
         
         //creamos un cliente
         Cliente c1= new Cliente("72208088W","cris","blanco","email",'T');
         
         //creamos una obra
        Obra obra=new Obra(1,"hola","comedia","español",true,10);
        
        //el cliente compra entradas para esa obra
        c1.compraEntrada(1, 3, obra);
        
        //el cliente reserva entradas para esa obra
        c1.reservaEntradas(1, 2, obra);
        
        //creamos un trabajador
        Trabajador t1=new Trabajador("dni","yo","tu","676064079","direc",2017,1,4,2000,1,4);
        System.out.println(t1.getFechaNacimiento());
        
        //creamos un taquillero
        Ttaquilla taquillero=new Ttaquilla(25, "13761000L","Pablo", "García", "645639001","Torrelavega", 1992,2,21,2017,5,12);
        //el taquillero vende entrada para la obra creada
        taquillero.vendeEntrada(1, 2, obra);
        
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
