/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Aportantes;
import Modelo.DatosAportantes;
import Vista.PreAportante;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mapii
 */
public class ControladorPreAportante {
    private PreAportante vista ;
    public PreAportante getVista() {
        return vista;
    }

    public void setVista(PreAportante vista) {
        this.vista = vista;
    }

    public ControladorPreAportante() {
        this.vista = new PreAportante();
        this.vista.getButton1().setOnAction(new Evento());
    }

private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
            String nombre=vista.getNombret().getText();
            String apellido=vista.getApellidot().getText();
            String tarjeta=vista.getNumerot().getText();
            Aportantes a =new Aportantes(nombre,apellido,tarjeta);
            DatosAportantes datos=DatosAportantes.getDatosAportantes();
            datos.aportantes.add(a);
           try {
               datos.imprimir();
           } catch (IOException ex) {
               System.out.println("Interrumped");
           }
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           ControladorAportante controlador = new 
                ControladorAportante(nombre,apellido,tarjeta);
           Scene escena =
                   controlador.getVista().getScene();
           stage.setTitle("Escena 1");
           stage.setScene(escena);
        }
    }
}