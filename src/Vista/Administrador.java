/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author mapii
 */
public class Administrador implements Vista {
    private Scene escena;

    public Administrador() {
        GridPane Pane = new GridPane();
        Label label=new Label("Administrador");
        Pane.getChildren().add(label);
        this.escena = new Scene(Pane, 1000, 650);
    }

    @Override
    public Scene getScene() {
        return this.escena; 
    }
    }
    
   
    

