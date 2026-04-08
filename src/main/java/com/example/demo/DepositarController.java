package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepositarController {
    @FXML
    private TextField monto;

    @FXML
    private Label resultado;

    @FXML
    public void depositar() {
        try {
            double m = Double.parseDouble(monto.getText());
            Cuenta.saldo += m;
            resultado.setText("Depositado: " + m);
        } catch (Exception e) {
            resultado.setText("Ingresa un número válido");
        }
    }
}
