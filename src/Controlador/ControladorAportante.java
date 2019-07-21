/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Aportante;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

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

    public ControladorAportante(String nombre,String apellido,String tarjeta) {
        this.vista = new Aportante(nombre,apellido,tarjeta);
        this.vista.getMenuItem1().setOnAction(new Evento2());
        this.vista.getMenuItem2().setOnAction(new Evento());
    }
    private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador1 controlador = new 
                Controlador1();
           Scene escena =
                   controlador.getVista().getScene();
           stage.setTitle("Escena 1");
           stage.setScene(escena);
        }
        
    }
    private class Evento2 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           ControladorPreAportante controlador = new 
                ControladorPreAportante();
           Scene escena =
                   controlador.getVista().getScene();
           stage.setTitle("Escena 1");
           stage.setScene(escena);
        }
    }
    
}
