/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.PrePromotor;
import Vista.Promotor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mapii
 */
public class ControladorPromotor {
    private Promotor vista;
    ControladorPromotor(String n, String a,String c,String i,String p) {
        this.vista = new Promotor(n,a,c,i,p);
        this.vista.getMenuItem1().setOnAction(new Evento2());
        this.vista.getMenuItem2().setOnAction(new Evento());
    }


    public Promotor getVista() {
        return vista;
    }

    public void setVista(Promotor vista) {
        this.vista = vista;
    }
    public Promotor getEscena() {
        return vista;
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
