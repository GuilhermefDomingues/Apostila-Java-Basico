package com.gui;

// Exercício 18 - Math
//
// Crie a classe Exercicio18. Use Math.max para descobrir o maior entre 45 e 78, Math.min para o menor
// e Math.abs para o valor absoluto de -12.
public class Exercicio18 {
    public static void main(String[] args) {
        int primeiroNumero = 45;
        int segundoNumero = 78;
        int numeroNegativo = -12;

        System.out.println("Maior: " + Math.max(primeiroNumero, segundoNumero));
        System.out.println("Menor: " + Math.min(primeiroNumero, segundoNumero));
        System.out.println("Valor absoluto: " + Math.abs(numeroNegativo));
    }
}
