/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.AdministradorPromotor;

/**
 *
 * @author mapii
 */
public class ControladorAdmPromotor {
    private AdministradorPromotor vista;

    public AdministradorPromotor getVista() {
        return vista;
    }

    public void setVista(AdministradorPromotor vista) {
        this.vista = vista;
    }

    public ControladorAdmPromotor() {
        this.vista=new AdministradorPromotor();
    }

    
   
    
    
}
