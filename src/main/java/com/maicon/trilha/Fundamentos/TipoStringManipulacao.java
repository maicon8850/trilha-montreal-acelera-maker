package com.maicon.trilha.Fundamentos;

import java.util.Scanner;

public class TipoStringManipulacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        // Tipo String Remove espaços antes e depois
        nome = nome.trim();

        // Tipo String Converte para maiúsculas e minúsculas
        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();

        // Tipo String Obtém o primeiro nome
        String primeiroNome = nome.split(" ")[0];

        // Tipo String Conta caracteres sem espaços
        int quantidadeCaracteres = nome.replace(" ", "").length();

        // Tipo String Exibe resultados

        System.out.println("\nNome com espaços removidos: " + nome);
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
        System.out.println("Nome em minúsculas: " + nomeMinusculo);
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Quantidade de caracteres (sem espaços): " + quantidadeCaracteres);

        sc.close();
    }
}
