package com.maicon.trilha.Collections.Set.TreeSetOrdenada;

import java.util.Set;
import java.util.TreeSet;

public class Biblioteca {
    public static void main(String[] args) {

        Set<String> livros = new TreeSet<>();

        livros.add("Java para Iniciantes");
        livros.add("Algoritmos em C");
        livros.add("Estruturas de Dados");
        livros.add("Java para Iniciantes"); // duplicado, será ignorado

        System.out.println("Livros cadastrados:");
        for (String livro : livros) {
            System.out.println(livro);
        }
    }
}