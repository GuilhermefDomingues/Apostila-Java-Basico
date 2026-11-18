package com.gui;

// Exercício 19 - Math

//
// Crie a classe Exercicio19. Calcule a área de um círculo de raio 5 usando Math.PI e Math.pow.
public class Exercicio19 {
    public static void main(String[] args) {
        double raio = 5;

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.2f%n", area);
    }
}
