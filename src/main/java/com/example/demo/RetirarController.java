package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RetirarController {

    @FXML
    private TextField monto;

    @FXML
    private Label resultado;


    @FXML
    public void retirar() {
        try {
            double m = Double.parseDouble(monto.getText());

            if (m <= Cuenta.saldo) {
                Cuenta.saldo -= m;
                resultado.setText("Retiro exitoso: " + m);
            } else {
                resultado.setText("Saldo insuficiente");
            }

        } catch (Exception e) {
            resultado.setText("Ingresa un número válido");
        }
    }
}
