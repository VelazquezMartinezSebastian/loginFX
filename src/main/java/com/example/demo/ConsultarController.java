package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConsultarController {

    @FXML
    private Label resultado;

    @FXML
    public void consultar() {
        resultado.setText("Saldo actual: " + Cuenta.saldo);
    }
}

//tqm
