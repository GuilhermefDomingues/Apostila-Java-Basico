package com.gui;

// Exercício 09 - Casting
//
// Crie a classe Exercicio09. Converta explicitamente o double 9.8 para int. Explique em comentário o
// que aconteceu com a parte decimal.
public class Exercicio09 {
    public static void main(String[] args) {
        double numero = 9.8;

        int convertido = (int) numero;
        // O cast descarta a parte decimal, sem arredondar.
        System.out.println("Double: " + numero);
        System.out.println("Inteiro: " + convertido);
    }
}
