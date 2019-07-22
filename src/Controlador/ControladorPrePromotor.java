/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author mapii
 */
import Vista.PrePromotor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControladorPrePromotor {
    private PrePromotor vista ;
    public PrePromotor getVista() {
        return vista;
    }

    public void setVista(PrePromotor vista) {
        this.vista = vista;
    }

    public ControladorPrePromotor() {
        this.vista= new PrePromotor();
        this.vista.getB1().setOnAction(new Evento());
    }

private class Evento 
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
}
