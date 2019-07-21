/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Escena1;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mapii
 */
public class Controlador1 {
    private Escena1 vista;
    
    public Escena1 getVista() {
        return vista;
    }

    public void setVista(Escena1 vista) {
        this.vista = vista;
    }
    public Escena1 getEscena() {
        return vista;
    }

    public Controlador1() {
        this.vista = 
              new Escena1();
        this.vista.getButton1().setOnAction(new Evento1());
        this.vista.getButton2().setOnAction(new Evento2());
        this.vista.getButton3().setOnAction(new Evento3());
    }
    private class Evento1 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           ControladorPromotor controlador = new 
                ControladorPromotor();
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
    private class Evento3
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           ControladorAdministrador controlador = new 
                ControladorAdministrador();
           Scene escena =
                   controlador.getVista().getScene();
           stage.setTitle("Escena 1");
           stage.setScene(escena);
        }
    }
    

}
