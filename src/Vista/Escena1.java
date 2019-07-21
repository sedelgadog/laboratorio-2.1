/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author mapii
 */
public class Escena1 implements Vista{
         private Scene escena;
         private Label label;
         private Button button1; 
         private Button button2; 
         private Button button3; 
    public Escena1() {
        GridPane Pane = new GridPane();
//        Pane.setAlignment(Pos.TOP_CENTER);
          Pane.setAlignment(Pos.CENTER);
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 100));
        Pane.setVgap(30 );
        Pane.add(scenetitle, 0, 0);
        Pane.setBackground(new Background(new BackgroundFill(Color.rgb(255, 255, 255), CornerRadii.EMPTY, Insets.EMPTY)));
        this.button1= new Button("Promotor");
        button1.setMinSize(400, 60);
        this.button2 = new Button("Aportante");
        button2.setMinSize(400, 60);
        this.button3 = new Button("Administrador");
        button3.setMinSize(400, 60);
        Pane.add(button1,0, 3);
        Pane.add(button2, 0, 5);
        Pane.add(button3, 0, 7);
         this.escena = new Scene(Pane, 1000, 650);
    }

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    public Button getButton3() {
        return button3;
    }

    public void setButton3(Button button3) {
        this.button3 = button3;
    }

   

    @Override
    public Scene getScene() {
       return this.escena; 
    }
    
}
