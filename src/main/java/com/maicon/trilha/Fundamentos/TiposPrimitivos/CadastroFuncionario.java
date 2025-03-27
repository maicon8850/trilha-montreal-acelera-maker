package com.maicon.trilha.Fundamentos.TiposPrimitivos;

/**
 * Classe que representa um funcionário com seus dados básicos.
 */
public class CadastroFuncionario {

    public String nome;
    public byte idade; // ocupa menos memória do que int
    public double salario;
    public char genero;
    public boolean ativoNaEmpresa;

    // Construtor para inicializar os atributos
    public CadastroFuncionario(String nome, byte idade, double salario, char genero, boolean ativoNaEmpresa) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
        this.ativoNaEmpresa = ativoNaEmpresa;
    }
}
