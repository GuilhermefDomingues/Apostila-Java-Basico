package com.gui;

// Exercício 17 - Aritmética
//
// Crie a classe Exercicio17. Calcule 15% de desconto sobre um subtotal de R$ 500,00 e exiba subtotal,
// desconto e total.
public class Exercicio17 {
    public static void main(String[] args) {
        double subtotal = 500.00;
        double percentualDesconto = 15.0;

        double desconto = subtotal * percentualDesconto / 100;
        double total = subtotal - desconto;
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
