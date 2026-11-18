package com.gui;

// Exercício 20 - Boolean e lógico

//
// Crie a classe Exercicio20. Um usuário pode entrar se estiver ativo e não estiver bloqueado. Modele a
// regra com booleans e !.
public class Exercicio20 {
    public static void main(String[] args) {
        boolean ativo = true;
        boolean bloqueado = false;

        boolean podeEntrar = ativo && !bloqueado;
        System.out.println("Pode entrar: " + podeEntrar);
    }
}
