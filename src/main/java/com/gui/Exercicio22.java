package com.gui;

// Exercício 22 - Ternário

//
// Crie a classe Exercicio22. Defina idade = 16 e use operador ternário para produzir “Maior de idade”
// ou “Menor de idade”.
public class Exercicio22 {
    public static void main(String[] args) {
        int idade = 16;

        String situacao = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(situacao);
    }
}
