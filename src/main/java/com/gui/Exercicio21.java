package com.gui;

// Exercício 21 - else if

//
// Crie a classe Exercicio21. Classifique uma nota: 9 ou mais = “Excelente”; 7 a 8,99 = “Aprovado”;
// abaixo de 7 = “Reprovado”.
public class Exercicio21 {
    public static void main(String[] args) {
        double nota = 8.5;

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
