package com.maicon.trilha.Fundamentos;

public class TipoStringEquals {
    public static void main(String[] args) {

        String nome1 = "Java";
        String nome2 = "Java";
        String nome3 = new String("Java");

        System.out.println(nome1.equals(nome2)); // true (conteúdo igual)
        System.out.println(nome1.equals(nome3)); // true (conteúdo igual)
        System.out.println(nome1 == nome3); // false (objetos diferentes na memória)
    }
}