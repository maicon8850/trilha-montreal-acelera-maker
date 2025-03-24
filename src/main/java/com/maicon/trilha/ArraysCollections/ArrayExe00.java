package com.maicon.trilha.ArraysCollections;

import java.util.Scanner;

/**
 * Enunciado:
 * Você deve criar um programa em Java que:
 *
 * Pergunte ao usuário quantas notas ele quer informar.
 *
 * Leia todas essas notas e armazene em um array.
 *
 * Calcule e exiba:
 *
 * A média das notas
 *
 * A maior nota
 *
 * A menor nota
 *
 * 📋 Requisitos obrigatórios
 * Usar um array para armazenar os valores.
 *
 * Usar laço for ou for-each para processar os dados.
 *
 * Utilizar Scanner para ler os valores digitados.
 *
 * 🎯 Exemplo de execução:
 * yaml
 * Copiar código
 * Quantas notas deseja inserir? 5
 * Digite a nota 1: 8.5
 * Digite a nota 2: 9.0
 * Digite a nota 3: 6.0
 * Digite a nota 4: 7.5
 * Digite a nota 5: 10.0
 *
 * Média das notas: 8.2
 * Maior nota: 10.0
 * Menor nota: 6.0
 */
public class ArrayExe00 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Qual é sua nota");

        int quantidade = entrada.nextInt();

        int[] notas = new int[quantidade];

        for (int i = 0; i < notas.length; i++ ){
            System.out.println("Informe o numero" + (i +1));   // é uma soma ent vamos usar ( )
            notas[i] = entrada.nextInt();
        }
         int soma = 0;
        for (int i = 0; i < notas.length; i++ ){
            soma += notas[i];
        }

        System.out.println(" Qual a soma das notas:" + soma);
    }}





