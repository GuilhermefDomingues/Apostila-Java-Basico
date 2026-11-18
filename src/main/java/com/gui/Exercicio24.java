package com.gui;

// Exercício 24 - String
//
// Crie a classe Exercicio24. Verifique com equals se o status "PAGO" é igual a "PAGO" e exiba o
// resultado.
public class Exercicio24 {
    public static void main(String[] args) {
        String status = "PAGO";

        boolean pago = status.equals("PAGO");
        System.out.println(pago);
    }
}
