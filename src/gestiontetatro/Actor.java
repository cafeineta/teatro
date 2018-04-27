package gestiontetatro;
import gestiontetatro.Compañia;
/**
 *
 * @author CrisBlancoMena
 */
public class Actor{
    //ATRIBUTOS
    private String nombre,apellidos,NIF;
    
    //CONSTRUCTOR
    public Actor() {
       
    }

    public Actor(String nombre, String apellidos, String NIF) {       
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;       
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF+ "}";
    }
    
    
    
}
