package com.maicon.trilha.Fundamentos.TiposPrimitivos;

import java.util.Scanner;

/**
 * Classe principal que faz a leitura dos dados de um funcionário
 * e exibe os resultados formatados.
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o nome do funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite a idade:");
        byte idade = sc.nextByte();

        System.out.println("Digite o salário:");
        double salario = sc.nextDouble();

        System.out.print("Digite o gênero (M/F): ");
        char genero = sc.next().charAt(0);

        System.out.print("Está ativo na empresa? (true/false): ");
        boolean ativoNaEmpresa = sc.nextBoolean();

        // Cria um objeto CadastroFuncionario com os dados lidos
        CadastroFuncionario funcionario = new CadastroFuncionario(nome, idade, salario, genero, ativoNaEmpresa);

        // Converte o gênero para texto legível
        String generoTexto = "Inválido";
        if (funcionario.genero == 'M' || funcionario.genero == 'm') {
            generoTexto = "Masculino";
        } else if (funcionario.genero == 'F' || funcionario.genero == 'f') {
            generoTexto = "Feminino";
        }

        // Saída de dados formatada
        System.out.println("\n===== DADOS DO FUNCIONÁRIO =====");
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.printf("Salário: R$ %.2f\n", funcionario.salario);
        System.out.println("Gênero: " + generoTexto);
        System.out.println("Ativo na empresa: " + (funcionario.ativoNaEmpresa ? "Sim" : "Não"));

        sc.close(); // Fecha o Scanner (boa prática)
    }
}
