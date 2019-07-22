/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.AdministradorAportante;

/**
 *
 * @author mapii
 */
public class ControladorAdmAportante {
    private AdministradorAportante vista;

    ControladorAdmAportante() {
        this.vista=new AdministradorAportante();
    }

    public AdministradorAportante getVista() {
        return vista;
    }

    public void setVista(AdministradorAportante vista) {
        this.vista = vista;
    }

    
    
    
}
