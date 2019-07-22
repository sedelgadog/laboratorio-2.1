/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.AdminitradorDatos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
/**
 *
 * @author mapii
 */
public class AdministradorPromotor implements Vista{
private Scene escena;

    public AdministradorPromotor() {
        VBox vbox=new VBox();
        AdminitradorDatos datos=AdminitradorDatos.getAdministradorDatos();
        
        
        
        
        
        this.escena = new Scene( vbox,1000, 650);
    }


    @Override
    public Scene getScene() {
        return this.escena; 
    }
    
}
