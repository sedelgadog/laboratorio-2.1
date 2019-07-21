/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author mapii
 */
public class AdminitradorDatos {
    private static AdminitradorDatos 
                     administradorDatos;
    public ObservableList<Aportantes> data=FXCollections.observableArrayList(
        new Aportantes("Gabriel","Riascos","Descubrimiento cientifico","1.000.00"),
        new Aportantes("Julio","Ojeda","Nueva Marca","800.000"),
        new Aportantes("Sebastian","Delgado","Produccion en masa","600.000"),
        new Aportantes("Nicolas","Jarro","Descubrimiento cientifico","400.00")
        );
    public static AdminitradorDatos getAdministradorDatos(){
      if (administradorDatos == null)
          administradorDatos = new AdminitradorDatos();
      return administradorDatos;
    }
    
}
