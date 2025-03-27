package com.maicon.trilha.ArraysCollections;

import java.util.Scanner;

public class ArrayExe00 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pergunta ao usuário quantas notas ele quer inserir
        System.out.print("Quantas notas deseja inserir? ");
        int quantidade = entrada.nextInt();

        // Cria um array para armazenar as notas
        double[] notas = new double[quantidade];

        // Lê as notas e armazena no array
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        // Variáveis para cálculo
        double soma = 0;
        double maior = notas[0]; // assume que a primeira nota é a maior no início
        double menor = notas[0]; // assume que a primeira nota é a menor no início

        // Processa as notas para somar, e achar maior e menor
        for (double nota : notas) {
            soma += nota;

            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
        }

        // Calcula a média
        double media = soma / notas.length;

        // Exibe os resultados formatados
        System.out.printf("\nMédia das notas: %.2f\n", media);
        System.out.printf("Maior nota: %.2f\n", maior);
        System.out.printf("Menor nota: %.2f\n", menor);

        entrada.close(); // Fecha o Scanner (boa prática)
    }
}
