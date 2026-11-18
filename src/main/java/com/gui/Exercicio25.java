package com.gui;

// Exercício 25 - while
//
// Crie a classe Exercicio25. Use while para fazer uma contagem regressiva de 5 até 1 e depois exiba
// “Fim”.
public class Exercicio25 {
    public static void main(String[] args) {
        int contador = 5;

        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
        System.out.println("Fim");
    }
}
