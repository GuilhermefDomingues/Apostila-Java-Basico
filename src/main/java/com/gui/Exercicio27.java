package com.gui;

// Exercício 27 - for
//
// Crie a classe Exercicio27. Use for para mostrar a tabuada do 7 de 1 a 10.
public class Exercicio27 {
    public static void main(String[] args) {
        int numero = 7;

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        }
    }
}
