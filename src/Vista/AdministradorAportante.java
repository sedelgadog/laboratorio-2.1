/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author mapii
 */
public class AdministradorAportante implements Vista {
private Scene escena;
private  MenuItem menuItem2;
    private MenuItem menuItem1;
    private MenuItem menuItem3;

    public AdministradorAportante() {
        BorderPane Pane = new BorderPane();
        //Menu
        Menu menu = new Menu("Promotor");
        this.menuItem1 = new
        MenuItem("Gestion promotores");
        this.menuItem2 = new
        MenuItem("Gestion aportantes");
        this.menuItem3 = new
        MenuItem("Meu principal");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        Pane.setTop(menuBar);
        this.escena = new Scene(Pane, 1000, 650);
    }


    @Override
    public Scene getScene() {
         return this.escena; 
    }
    
}
