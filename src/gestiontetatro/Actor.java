package gestiontetatro;
import gestiontetatro.Compañia;
import static gestiontetatro.DNINoValido.dniNo;
/**
 *
 * @author CrisBlancoMena
 * clase para crear los actores que pertenecen a una o varias compañias
 */
public class Actor{
    //ATRIBUTOS
    private String nombre,apellidos,NIF;
    
    //CONSTRUCTOR
    public Actor() {
       
    }

    public Actor(String nombre, String apellidos, String NIF) {       
        
        try{
            this.nombre = nombre;
            this.apellidos = apellidos;
            dniNo(NIF);
            this.NIF = NIF;    
        }
        catch(DNINoValido e){
            System.out.println("Se ha producido una excepcion en el DNI");
            e.printStackTrace();
        }
           
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF+ "}";
    }
    
    
    
    
}
