package com.maicon.trilha.Classe;

public class DataTeste {
    public static void main(String[] args) {



///  referenciando o construtor com parametros
        Data data1 = new Data(1,  12 , 1970);

        /// aqui esta referenciando o construtor sem parametros 9 padrao
        Data data2 = new Data();

        /// %d representa o int
        String dataFormatada1 = data1.obterDataFormatada();
        System.out.println(dataFormatada1);
        System.out.println(data2.obterDataFormatada());

        data1.obterDataFormatada();
        data2.obterDataFormatada();
    }
}