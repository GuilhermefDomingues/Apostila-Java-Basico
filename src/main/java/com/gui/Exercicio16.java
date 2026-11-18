package com.gui;

// Exercício 16 - Numbers e operadores
//
// Crie a classe Exercicio16. Calcule o valor total de 4 produtos a R$ 29,90 cada.
public class Exercicio16 {
    public static void main(String[] args) {
        int quantidade = 4;
        double precoUnitario = 29.90;

        double total = quantidade * precoUnitario;
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
