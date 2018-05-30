/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontetatro;

import java.util.Scanner;

/**
 *
 * @author Ceciliaherrero
 */
public class ValidaFecha extends Exception{
    
    static Scanner Entrada=new Scanner(System.in);
    static private int dia=0,mes=0;
    static private boolean seguir;
    
    
    public ValidaFecha(){
        super("La fecha introducida no es válida");
        }
    
     public static int validaDia(int di) throws ValidaFecha{
         
         do { 
             //di=Entrada.nextInt();
         if(di>=1 && di<=31){
            System.out.println("BIEN HECHO");
              dia=di;}
         
         else{
            System.out.println("Se ha equivocado de día, ¿Quiere repetir?");
            seguir=Entrada.nextBoolean();
            if(seguir=true){
                System.out.println("DÍA NUEVO");
                di=Entrada.nextInt();
                }
            else{
                
            }
            throw new ValidaFecha();
         }
         
         }
         while(seguir==true);
         return dia;
     }
    
    public static int validaMes (int me) throws ValidaFecha{
        do{
           
        if(me>=1 && me<=12){
            System.out.println("BIEN HECHO");
        mes=me;
        }
        else{
            System.out.println("¿Quiere repetir el mes?");
            seguir=Entrada.nextBoolean();
            if(seguir=true){
                System.out.println("MES NUEVO");
                me=Entrada.nextInt();
                }

            throw new ValidaFecha();
}
            } while (seguir==true);     
        
        return mes;
}
}
