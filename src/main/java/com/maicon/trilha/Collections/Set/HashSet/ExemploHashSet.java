package com.maicon.trilha.Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>(); // não permite duplicatas.

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã"); // repetida, não será adicionada

        System.out.println("Frutas no conjunto:");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}