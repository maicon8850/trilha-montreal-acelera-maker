package com.maicon.trilha.ClassesMetodos;

public class Pessoa {
    String nome;
    double peso;


    public Pessoa(double peso, String nome) {
        this.peso = peso;
        this.nome = nome;
    }


    // metodo

   public void comer( Comida comida1 ){

       this.peso += comida1.pesoComida;
    }

    String apresentacao (){
        return "Ola meu nome é Jose" + nome + " Meu peso é " + peso;
    }
}
