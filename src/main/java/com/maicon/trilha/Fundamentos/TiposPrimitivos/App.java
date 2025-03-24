package com.maicon.trilha.Fundamentos.TiposPrimitivos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o nome do funcionario");
        String nome = sc.nextLine();


        System.out.println("Digite a idade");
        Byte idade = sc.nextByte();

        System.out.println("Digite o salário");
         Double salario = sc.nextDouble();

        System.out.println("Digite o gênero (M/F):;");
        char genero = sc.next().charAt(0);

        // estrutura condicional para verificar

        String digiteGenero = "Invalido";
        if (genero == 'm' ){
            digiteGenero = "Masculino";
        } else if (genero == 'f' ) {
            digiteGenero = "Feminino";
        }
        // Saida de dados

        System.out.println("Funcionario:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Salário:" + salario);
        System.out.println("Genero:" + digiteGenero);

    }
}

