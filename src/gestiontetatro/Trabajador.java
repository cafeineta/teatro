/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import static gestiontetatro.ValidarFecha.validaDia;
import static gestiontetatro.ValidarFecha.validaMes;
import static gestiontetatro.ValidarTelefono.validaTel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cecilia
 * clase creada para la creación y acceso a los datos de los trabajadores
 */
public class Trabajador {
    
    //atributos
    private String NIF, nombre, apellidos, telefono, direccion;
    private Calendar fechaNacimiento, fechaIngreso;
 
    public Trabajador() {
    }
    
    public Trabajador(String NIF, String nombre, String apellidos, String telefono, String direccion, int año1, int mes1, int dia1, int año2, int mes2, int dia2) throws ValidarTelefono {
        try{
            this.NIF = NIF;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.telefono = validaTel(telefono);
            this.direccion = direccion;
            int diaval=validaDia(dia1);
            int mesval=validaMes(mes1);
            this.fechaNacimiento.set(año1, mesval, diaval);
            diaval=validaDia(dia2);
            mesval=validaMes(mes2);
            this.fechaIngreso.set(año2, mesval, diaval);
        }
        catch(ValidarTelefono e){
            e.printStackTrace();
        } catch (ValidarFecha ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    /**
     * Función que transforma la fecha dada por el sistema al formato dia/mes/año
     * @return la fecha en el formato indicado anteriormente
     */
    public String formatoFechaNaci(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MMMMM/yyyy");
        
        return sdf.format(this.fechaNacimiento.getTime());
    }
    
    /**
     * Función que transforma la fecha dada por el sistema al formato dia/mes/año
     * @return la fecha en el formato indicado anteriormente
     */
    public String formatoFechaIngreso(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MMMMM/yyyy");
        
        return sdf.format(this.fechaIngreso.getTime());
    }

    @Override
    public String toString() {
        return "Trabajador{" + "NIF=" + NIF + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
}
