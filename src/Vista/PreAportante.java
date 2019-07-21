/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author mapii
 */
public class PreAportante implements Vista{
    private Scene escena;
    private Button button1;
    private TextField nombret;
    private TextField apellidot;
    private TextField numerot;

    public PreAportante() {
        GridPane pane =new GridPane();
        Label datos =new Label("Datos Personales");
        datos.setFont(new Font("Arial", 50));
        Label nombrel=new Label("Nombre");
        this.nombret=new TextField();
        Label apellidol=new Label("Apellido");
        this.apellidot=new TextField();
        Label numerol=new Label("Numero Tarjeta");
        this.numerot=new TextField();
        this.button1=new Button("Guardar");
        pane.setAlignment(Pos.CENTER);
        pane.add(datos, 0, 0);
        pane.add(nombrel, 0, 1);
        pane.add(nombret, 0, 2);
        pane.add(apellidol, 0, 3);
        pane.add(apellidot, 0, 4);
        pane.add(numerol, 0, 5);
        pane.add(numerot, 0, 6);
        pane.add(button1, 0, 8);
        this.escena = new Scene(pane, 1000, 650);
    }

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    public TextField getNombret() {
        return nombret;
    }

    public void setNombret(TextField nombret) {
        this.nombret = nombret;
    }

    public TextField getApellidot() {
        return apellidot;
    }

    public void setApellidot(TextField apellidot) {
        this.apellidot = apellidot;
    }

    public TextField getNumerot() {
        return numerot;
    }

    public void setNumerot(TextField numerot) {
        this.numerot = numerot;
    }

    
    @Override
    public Scene getScene() {
         return this.escena; 
    }
}
