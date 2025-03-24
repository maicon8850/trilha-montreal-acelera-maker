package com.maicon.trilha.Fundamentos.TiposPrimitivos;

public class CadastroFuncionario {
    public String nome;
    public byte idade;
    /// usa menos memória
    public double salario;
    public char genero;
    public boolean ativoNaEmpresa;


    public CadastroFuncionario(String nome, byte idade, double salario, char genero, boolean ativoNaEmpresa) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
        this.ativoNaEmpresa = ativoNaEmpresa;
    }

}
