/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Administrador;

/**
 *
 * @author mapii
 */
public class ControladorAdministrador {
    private Administrador vista;

    public Administrador getVista() {
        return vista;
    }

    public void setVista(Administrador vista) {
        this.vista = vista;
    }

    public ControladorAdministrador() {
        this.vista = 
              new Administrador();
    }
    
    
}
