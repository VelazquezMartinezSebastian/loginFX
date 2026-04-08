package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SegundavistaController {



        @FXML
        public void abrirDepositar() {
            abrirVentana("Depositar.fxml", "Depositar");
        }

        @FXML
        public void abrirRetirar() {
            abrirVentana("retirar.fxml", "Retirar");
        }

        @FXML
        public void abrirConsultar() {
            abrirVentana("consultar.fxml", "Consultar");
        }


        private void abrirVentana(String archivoFXML, String titulo) {
            try {
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/com/example/demo/" + archivoFXML)
                );

                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle(titulo);
                stage.setScene(new Scene(root));
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



