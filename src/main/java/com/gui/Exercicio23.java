package com.gui;

// Exercício 23 - String
//
// Crie a classe Exercicio23. Para a String "Java Básico", mostre o tamanho, a versão em maiúsculas e a
// versão em minúsculas.
public class Exercicio23 {
    public static void main(String[] args) {
        String texto = "Java Básico";

        System.out.println("Tamanho: " + texto.length());
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
    }
}
