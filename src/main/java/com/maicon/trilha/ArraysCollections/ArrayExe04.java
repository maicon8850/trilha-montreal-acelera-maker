package com.maicon.trilha.ArraysCollections;

import java.util.Scanner;

///Você deve criar um programa que:
///
/// Pergunte quantos alunos serão avaliados.
///
/// Para cada aluno, peça:
///
/// Seu nome
///
/// Sua nota
///
/// Armazene os nomes e as notas em arrays separados.
///
/// Depois, mostre apenas os alunos com nota maior ou igual a 7.
public class ArrayExe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão avaliados:");
        int quantidadeAlunos = Integer.parseInt(sc.nextLine());  // convertendo inteiro em string

        String[]alunos = new String[quantidadeAlunos];

        for ( int i= 0; i < alunos.length; i++ ){
            System.out.println("Fale seu nome");
            alunos[i] = sc.nextLine() ;
        }
        double [] notas = new double[quantidadeAlunos];
        for (int i = 0 ; i < notas.length; i++){
            System.out.println("Qual a sua nota");
            notas[i] = sc.nextDouble();
        }
        double aprovados = 0;

        for (int a = 0 ; a < notas.length; a++){

            if ( notas[a] > 7 ) {
                aprovados++;

            }

            //System.out.println("Alunos aprovas" + a );

        }
    }
}
