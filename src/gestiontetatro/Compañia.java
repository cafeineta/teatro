package gestiontetatro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CrisBlancoMena
 * clase creada para la creacion y acceso a las compañias que trabajan en el teatro
 */
public class Compañia {
    //ATRIBUTOS
    protected String nombre;
    protected Calendar fechaCreacion=Calendar.getInstance();
    private ArrayList <Obra> obrasRepre;
    private ArrayList <Actor> actores;
    
    //CONSTRUCTOR
    public Compañia() {
    }

    public Compañia(String nombre, int año, int mes, int dia) {        
        this.nombre = nombre;
        this.fechaCreacion.set(año, mes, dia);
        this.obrasRepre=new ArrayList();
        this.actores=new ArrayList();
    }
    
    
    //METODOS
    /**
     * Función que transforma la fecha dada por el sistema al formato dia/mes/año
     * @return la fecha en el formato indicado anteriormente
     */
    public String formatoFecha(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MMMMM/yyyy");
        
        return sdf.format(this.fechaCreacion.getTime());
    }

    @Override
    public String toString() {
        return "Compañia{" + "nombre=" + nombre + ", fechaCreacion=" + formatoFecha() + '}';
    }
}
