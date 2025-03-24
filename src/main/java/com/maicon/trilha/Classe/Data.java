package com.maicon.trilha.Classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(int diaMes, int mesAno, int anoAno){
        mes = mesAno;
        dia = diaMes;
        ano = anoAno;
    }
    /// coonstrutor padrao
    Data(){
        dia = 1;
        mes = 12;
        ano = 1970;
    }

    String obterDataFormatada( ){

        return String.format("%d/%d/%d" ,dia , ano, mes);

    }
}
