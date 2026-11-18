package com.gui;

// Exercício 14 - switch
//
// Crie a classe Exercicio14. Use switch para converter o número 1 em “Segunda-feira”, 2 em “Terça-
// feira” e outros em “Dia não cadastrado”.
public class Exercicio14 {
    public static void main(String[] args) {
        int dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Dia não cadastrado");
                break;
        }
    }
}
