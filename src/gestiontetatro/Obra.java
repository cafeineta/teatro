package gestiontetatro;

import java.util.ArrayList;

/**
 *
 * @author CrisBlancoMena
 */
public class Obra{
    //ATRIBUTOS
    private int idObra;
    private String nombre, genero, idioma;
    private boolean traduccionSignos;
    public ArrayList <Entrada> entradas;
    
    //CONSTRUCTOR
    public Obra() {
    }

    public Obra(int id, String nombre, String genero, String idioma, boolean traduccionSignos) {
        this.idObra = id;
        this.nombre = nombre;
        this.genero = genero;
        this.idioma = idioma;
        this.traduccionSignos = traduccionSignos;
        this.entradas=new ArrayList();
    }

    public int getIdObra() {
        return idObra;
    }
    
    public int getnumentradas(){
        int numero = 0;
        numero = entradas.size();
        return numero;
    }
    //METODOS
    @Override
    public String toString() {
        return "Obra{" + "id=" + idObra + ", nombre=" + nombre + ", genero=" + genero + ", idioma=" + idioma + ", traduccionSignos=" + traduccionSignos + '}';
    }
    
}
