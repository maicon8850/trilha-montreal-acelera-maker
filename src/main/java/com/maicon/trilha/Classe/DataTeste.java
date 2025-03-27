package com.maicon.trilha.Classe;


public class DataTeste {
    public static void main(String[] args) {

        // Criando um objeto usando o construtor com parâmetros
        Data data1 = new Data(1, 12, 1970);

        // Criando um objeto usando o construtor padrão (sem parâmetros)
        Data data2 = new Data();

        // Obtendo a data formatada a partir dos objetos
        String dataFormatada1 = data1.obterDataFormatada(); // 01/12/1970
        String dataFormatada2 = data2.obterDataFormatada(); // 01/12/1970 (valor padrão)

        // Exibindo no console
        System.out.println(dataFormatada1);
        System.out.println(dataFormatada2);

        // Essas chamadas abaixo não imprimem nada pois o retorno não está sendo usado
        // Elas podem ser removidas sem afetar o programa
        data1.obterDataFormatada();
        data2.obterDataFormatada();
    }
}
