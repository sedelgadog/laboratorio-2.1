/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Aportante;

/**
 *
 * @author mapii
 */
public class ControladorAportante {
    private Aportante vista ;

    public Aportante getVista() {
        return vista;
    }

    public void setVista(Aportante vista) {
        this.vista = vista;
    }

    public ControladorAportante() {
        this.vista = 
              new Aportante();
    }
    
    
}
