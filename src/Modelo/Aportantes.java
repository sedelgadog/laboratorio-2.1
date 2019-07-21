/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author mapii
 */
public class Aportantes {
    private SimpleStringProperty nombre;
    private SimpleStringProperty apellido;
    private SimpleStringProperty dinero;
    private final SimpleStringProperty tipo;

    public Aportantes(String nombre, String apellido, String dinero, String tipo) {
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.dinero = new SimpleStringProperty(dinero);
        this.tipo = new SimpleStringProperty(tipo);
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellido() {
        return apellido.get();
    }

    public void setApellido(String apellido) {
        this.apellido.set(apellido);
    }

    public String getDinero() {
        return dinero.get();
    }

    public void setDinero(String dinero) {
        this.dinero.set(dinero);
    }

    public String getTipo() {
        return tipo.get();
    }

    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }
    
    
}
