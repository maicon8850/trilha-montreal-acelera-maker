package com.maicon.trilha.Collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class HistoricoNavegador {
    public static void main(String[] args) {
        Set<String> historico = new LinkedHashSet<>();

        historico.add("google.com");
        historico.add("openai.com");
        historico.add("github.com");
        historico.add("openai.com"); // repetido, será ignorado

        System.out.println("Histórico de páginas:");
        for (String site : historico) {
            System.out.println(site);
        }
    }
}
