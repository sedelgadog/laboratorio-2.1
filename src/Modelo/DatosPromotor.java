/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bordados Yasmin
 */
public class DatosPromotor {
        private static DatosPromotor
                     datosPromotor;
    public ArrayList<Promotor> promotores;

    public DatosPromotor() {
        this.promotores=new ArrayList<>();
    }
    
    public static DatosPromotor getDatosPromotor(){
      if (datosPromotor == null)
          datosPromotor = new DatosPromotor();
      return datosPromotor;
    }
    public void imprimir() throws IOException{
        File archivoSalida=new File("promotores.txt");
        if(archivoSalida.exists()){
            Scanner input =new Scanner(archivoSalida);
            while(input.hasNext()){
                String nombre=input.next();
                String apellido=input.next();
                String dinero=input.next();
                String tipo = input.next();
                Promotor ap =new Promotor(nombre,apellido,dinero,tipo);
                promotores.add(ap);
            }
        archivoSalida.delete();
                //Salida
                PrintStream salida=null;
                salida=new PrintStream(archivoSalida);
                for(Promotor item:promotores){
                    salida.println(item.getNombre());
                    salida.println(item.getApellido());
                    salida.println(item.getDinero());
                    salida.println(item.getTipo());
                }
        }
    }
}
