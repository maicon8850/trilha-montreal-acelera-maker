package com.maicon.trilha.Collections.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Imagina um sistema acadêmico onde você quer manter um ranking de alunos com matrícula como chave e nome como valor,
 * ordenado automaticamente pela matrícula.
 */

public class RankingAlunos {
    public static void main(String[] args) {
        Map<Integer, String> ranking = new TreeMap<>();

        ranking.put(2023123, "João");
        ranking.put(2023101, "Maria");
        ranking.put(2023110, "Pedro");

        // Exibe em ordem crescente das matrículas
        System.out.println("Ranking de Alunos:");
        for (Integer matricula : ranking.keySet()) {
            System.out.println(matricula + " - " + ranking.get(matricula));
        }
    }
}
