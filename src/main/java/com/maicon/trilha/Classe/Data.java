package com.maicon.trilha.Classe;

public class Data {

    // Atributos da classe
    int dia;
    int mes;
    int ano;

    // Construtor com parâmetros
    Data(int diaMes, int mesAno, int anoAno) {
        dia = diaMes;
        mes = mesAno;
        ano = anoAno;
    }

    // Construtor padrão (sem parâmetros)
    Data() {
        dia = 1;
        mes = 12;
        ano = 1970;
    }

    // Método que retorna a data formatada como texto
    String obterDataFormatada() {
        // Corrigido: ordem correta é dia/mês/ano
        return String.format("%02d/%02d/%04d", dia, mes, ano);
        // %02d → dois dígitos com zero à esquerda, %04d → ano com 4 dígitos
    }
}
