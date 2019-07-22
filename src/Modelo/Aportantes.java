/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author mapii
 */
public class Aportantes {
    private String nombre;
    private String apellido;
    private String numerot;

    public Aportantes(String nombre, String apellido, String numerot) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerot = numerot;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumerot() {
        return numerot;
    }

    public void setNumerot(String numerot) {
        this.numerot = numerot;
    }
    
}
