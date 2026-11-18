package com.gui;

// Exercício 26 - do/while
//
// Crie a classe Exercicio26. Use do/while para imprimir de 1 a 5.
public class Exercicio26 {
    public static void main(String[] args) {
        int contador = 1;

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 5);
    }
}
