package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SegundavistaController {

    @FXML
    private TextField monto;

    @FXML
    private Label resultado;

    private double saldo = 0;

    @FXML
    public void depositar() {
        try {
            double m = Double.parseDouble(monto.getText());
            saldo += m;
            resultado.setText("Depositado: " + m);
        } catch (Exception e) {
            resultado.setText("Ingresa un número válido");
        }
    }

    @FXML
    public void retirar() {
        try {
            double m = Double.parseDouble(monto.getText());

            if (m <= saldo) {
                saldo -= m;
                resultado.setText("Retiro exitoso: " + m);
            } else {
                resultado.setText("Saldo insuficiente");
            }

        } catch (Exception e) {
            resultado.setText("Ingresa un número válido");
        }
    }

    @FXML
    public void consultar() {
        resultado.setText("Saldo actual: " + saldo);
    }
}
//tqm