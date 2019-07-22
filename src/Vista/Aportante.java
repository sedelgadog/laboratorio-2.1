/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.AdminitradorDatos;
import Modelo.Aportantes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author mapii
 */
public class Aportante implements Vista{
    private Scene escena;
    private  MenuItem menuItem2;
    private MenuItem menuItem1;

    public Aportante(String n,String a,String t) {
        //Separador
        Separator separator1 = new Separator();
        Separator separator2 = new Separator();
        Separator separator3 = new Separator();
        Separator separator4 = new Separator();
        //Layout
        BorderPane Pane = new BorderPane();
        VBox vbox =new VBox();
        VBox vbox2=new VBox();
        //Nodos
        //Label
        Label subastas =new Label("             Subastas");
        subastas.setFont(new Font("Arial", 40));
        Label datosp =new Label("Datos Personales");
        datosp.setFont(new Font("Arial", 40));
        Label nombrel =new Label("Nombre:");
        nombrel.setFont(new Font("Arial", 20));
        Text text1 = new Text();
        text1.setFont(new Font(20));
        text1.setText(n);
        Label apellidol =new Label("Apellido");
        apellidol.setFont(new Font("Arial", 20));
        Text text2 = new Text();
        text2.setFont(new Font(20));
        text2.setText(a);
        Label tarjetal =new Label("Tarjeta Credito:");
        tarjetal.setFont(new Font("Arial", 20));
        Text text3 = new Text();
        text3.setFont(new Font(20));
        text3.setText(t);
        //Botones
        Button button1=new Button();
        Button button2=new Button();
        //ObservableList
        AdminitradorDatos datos =AdminitradorDatos.getAdministradorDatos();
        //Tabla
        TableView table = new TableView();
        table.setEditable(true);
        table.setMinSize(10, 10);
        table.setMaxSize(500, 300);
        TableColumn nombre = new TableColumn("Nombre");
        TableColumn apellido = new TableColumn("Apellido");
        TableColumn tipo = new TableColumn("Tipo Iniciativa");
        tipo.setMinWidth(200);
        TableColumn dineroActual = new TableColumn("Dinero Actual");
        dineroActual.setMinWidth(100);
         nombre.setCellValueFactory(new PropertyValueFactory<Promotor,String>("nombre"));
        apellido.setCellValueFactory(new PropertyValueFactory<Promotor,String>("apellido"));
        tipo.setCellValueFactory(new PropertyValueFactory<Promotor,String>("dinero"));
        dineroActual.setCellValueFactory(new PropertyValueFactory<Promotor,String>("tipo"));
        table.setItems(datos.data);
        //Menu
        Menu menu = new Menu("Opciones");
        this.menuItem1 = new
        MenuItem("Editar informacion personal");
        this.menuItem2 = new
        MenuItem("Menu principal");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        //Agregacion
        table.getColumns().addAll(nombre, apellido,tipo,dineroActual);
        vbox.getChildren().addAll(datosp,separator1,nombrel,text1,separator2,apellidol,text2,separator3,tarjetal,text3,separator4);
        vbox2.getChildren().add(subastas);
        vbox2.getChildren().add(table);
        Pane.setCenter(vbox2);
        Pane.setLeft(vbox);
        Pane.setTop(menuBar);
        this.escena = new Scene(Pane, 1000, 650);
    }

    public MenuItem getMenuItem2() {
        return menuItem2;
    }

    public void setMenuItem2(MenuItem menuItem2) {
        this.menuItem2 = menuItem2;
    }

    public MenuItem getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(MenuItem menuItem1) {
        this.menuItem1 = menuItem1;
    }
    
    
    
    @Override
    public Scene getScene() {
        return this.escena; 
    }
    
}
