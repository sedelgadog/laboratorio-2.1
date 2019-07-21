/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Aportantes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author mapii
 */
public class Aportante implements Vista{
    private Scene escena;

    public Aportante() {
        BorderPane Pane = new BorderPane();
        TableView table = new TableView();
        table.setEditable(true);
        table.setMinSize(500, 500);
        TableColumn nombre = new TableColumn("Nombre");
        TableColumn apellido = new TableColumn("Apellido");
        TableColumn tipo = new TableColumn("Tipo Iniciativa");
        tipo.setMinWidth(400);
        TableColumn dineroActual = new TableColumn("Dinero Actual");
        dineroActual.setMinWidth(100);
        TableColumn pujar = new TableColumn("Pujar");
        
        //////////
        final ObservableList<Aportantes> data=FXCollections.observableArrayList(
        new Aportantes("Nicolas","Jarro","xd","xd"),
        new Aportantes("Nicolas","Jarro","xd","xd"),
        new Aportantes("Nicolas","Jarro","xd","xd"),
        new Aportantes("Nicolas","Jarro","xd","xd")
        );
        /////////////////////////
        nombre.setCellValueFactory(new PropertyValueFactory<Aportantes,String>("nombre"));
        apellido.setCellValueFactory(new PropertyValueFactory<Aportantes,String>("apellido"));
        tipo.setCellValueFactory(new PropertyValueFactory<Aportantes,String>("dinero"));
        dineroActual.setCellValueFactory(new PropertyValueFactory<Aportantes,String>("tipo"));
        ////////
        table.setItems(data);
        //////////
        table.getColumns().addAll(nombre, apellido,tipo,dineroActual);
        Pane.setCenter(table);
        
        this.escena = new Scene(Pane, 1000, 650);
    }
    
    
    
    @Override
    public Scene getScene() {
        return this.escena; 
    }
    
}
