package com.gui;

// Exercício 13 - if/else
//
// Crie a classe Exercicio13. Para nota = 6, exiba “Aprovado” se nota >= 7; caso contrário,
// “Reprovado”.
public class Exercicio13 {
    public static void main(String[] args) {
        double nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
