/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import Controlador.Controlador1;
import Controlador.Singleton;
import Vista.Vista;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mapii
 */
public class Laboratorio2 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
         Controlador1 controlador = new 
               Controlador1();
       Vista vista = controlador.getEscena();
       Scene esc = vista.getScene();
       Singleton singleton = Singleton.getSingleton();
       singleton.setStage(primaryStage);
       
       primaryStage.setTitle("Escena 1");
       primaryStage.setScene(esc);
       primaryStage.show();
    }
    
}
