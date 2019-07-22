/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author mapii
 */
public class PrePromotor implements Vista{
    private Scene escena;
    
    private Label LaNombre;
    private TextField txtNombre;
    private Label LaApellido;
    private TextField txtApellido;
    private Label LaMontoI;
    private TextField txtMontoI;
    private Label LaMontoM;
    private TextField txtMontoM;
    private Label LaCorreo;
    private TextField txtCorreo;
    private Label LaPromotor;
    private Label LaIniciativa;
    private TextField txtIniciativa;
    private Label LaPresupuesto;
    private TextField txtPresupuesto;
    
    private Button B1;

    public TextField gettxtNombre() {
        return txtNombre;
    }

    public void settxtNombre(TextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public TextField gettxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(TextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public TextField gettxtCorreo() {
        return txtCorreo;
    }

    public void settxtCorreo(TextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }
    public TextField gettxtIniciativa() {
        return txtIniciativa;
    }

    public void settxtIniciativa(TextField txtIniciativa) {
        this.txtCorreo = txtIniciativa;
    }

    public Button getB1() {
        return B1;
    }

    public void setB1(Button B1) {
        this.B1 = B1;
    }

    public TextField getTxtPresupuesto() {
        return txtPresupuesto;
    }

    public void setTxtPresupuesto(TextField txtPresupuesto) {
        this.txtPresupuesto = txtPresupuesto;
    }


    public PrePromotor() {
        GridPane Pane = new GridPane();
        Label label=new Label("Promotor");
        Label Data = new Label("Datos Personales");
        Data.setFont(new Font("Arial", 50));
        
        Label LaNombre = new Label("Nombre");
        this.txtNombre = new TextField();
        Label LaApellido = new Label("Apellido");
        this.txtApellido = new TextField();
        Label LaCorreo = new Label("Correo");
        this.txtCorreo = new TextField();
        Label LaIniciativa = new Label("Iniciativa");
        this.txtIniciativa = new TextField();
        Label LaPresupuesto = new Label("Presupuesto");
        this.txtPresupuesto = new TextField();
        this.B1 = new Button("Guardar");
 
        
        Pane.add(Data, 0, 0);
        Pane.setAlignment(Pos.CENTER);
        
        Pane.add(LaNombre, 0, 1);
        GridPane.setHalignment(LaNombre, HPos.LEFT);
        Pane.add(txtNombre, 0, 2);
        GridPane.setHalignment(txtNombre, HPos.LEFT);
        Pane.add(LaApellido, 0, 3);
        GridPane.setHalignment(LaApellido, HPos.LEFT);
        Pane.add(txtApellido, 0, 4);
        GridPane.setHalignment(txtApellido, HPos.LEFT);
        Pane.add(LaCorreo, 0, 5);
        GridPane.setHalignment(LaCorreo, HPos.LEFT);
        Pane.add(txtCorreo,  0, 6);
        GridPane.setHalignment(txtCorreo, HPos.LEFT);
        Pane.add(LaIniciativa, 0, 7);
        GridPane.setHalignment(LaIniciativa, HPos.LEFT);
        Pane.add(txtIniciativa,  0, 8 );
        GridPane.setHalignment(txtIniciativa, HPos.LEFT);
        Pane.add(LaPresupuesto, 0, 9);
        GridPane.setHalignment(LaPresupuesto, HPos.LEFT);
        Pane.add(txtPresupuesto,  0, 10 );
        GridPane.setHalignment(txtPresupuesto, HPos.LEFT);
        
        Pane.add(B1, 0, 11);
        
        this.escena = new Scene(Pane, 1000, 650);
    }
    
    
    
    @Override
    public Scene getScene() {
      return this.escena; 
    }
    
}
