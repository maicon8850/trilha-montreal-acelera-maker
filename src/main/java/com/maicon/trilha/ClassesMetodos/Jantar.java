package com.maicon.trilha.ClassesMetodos;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Feijão", 0.33);
        Comida cs =  new Comida("Arroz" , 0.67);


        Pessoa pessoa1 = new Pessoa(80.5, "Jose" );


        System.out.println(pessoa1.apresentacao());
        pessoa1.comer(c1);
        System.out.println(pessoa1.apresentacao());
        pessoa1.comer(c1);
    }

}
