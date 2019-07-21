/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Promotor;

/**
 *
 * @author mapii
 */
public class ControladorPromotor {
    private Promotor vista;

    public Promotor getVista() {
        return vista;
    }

    public void setVista(Promotor vista) {
        this.vista = vista;
    }
    public Promotor getEscena() {
        return vista;
    }
    public ControladorPromotor() {
        this.vista = 
              new Promotor();
    }
    
}
