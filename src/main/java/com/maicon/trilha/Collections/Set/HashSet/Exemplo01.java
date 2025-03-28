package com.maicon.trilha.Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Exemplo01 {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
    }
}
