package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField usuario;

    @FXML
    private PasswordField contra;

    @FXML
    private Label mensaje;

    public void abrirVentana(ActionEvent event) {

        // Usuario y contraseña correctos
        if (usuario.getText().equals("admin") && contra.getText().equals("1234")) {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle("Segunda Ventana");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            mensaje.setText("Datos incorrectos");
        }
    }



}
//SSS