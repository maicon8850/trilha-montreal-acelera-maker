package com.maicon.trilha.Arrays;

import java.util.Scanner;

/**
 * Esse programa:
 * - Pergunta quantos alunos serão avaliados
 * - Lê o nome e a nota de cada aluno
 * - Armazena os nomes e as notas em arrays
 * - Exibe apenas os alunos com nota maior ou igual a 7
 */
public class ArrayExe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pergunta ao usuário quantos alunos serão avaliados
        System.out.print("Quantos alunos serão avaliados: ");
        int quantidadeAlunos = Integer.parseInt(sc.nextLine());  // Lê como string e converte pra int

        // Cria arrays para armazenar nomes e notas
        String[] alunos = new String[quantidadeAlunos];
        double[] notas = new double[quantidadeAlunos];

        // Lê os nomes e notas dos alunos
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();

            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(sc.nextLine());
        }

        // Exibe os alunos com nota maior ou igual a 7
        System.out.println("\nAlunos aprovados (nota >= 7):");
        boolean algumAprovado = false;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas[i] >= 7.0) {
                System.out.println(alunos[i] + " - Nota: " + notas[i]);
                algumAprovado = true;
            }
        }

        if (!algumAprovado) {
            System.out.println("Nenhum aluno aprovado.");
        }

        sc.close(); // Boa prática: fecha o Scanner ao final
    }
}
