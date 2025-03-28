package com.maicon.trilha.Collections.Map.LinkedHashMap;

/**
 * Imagina um sistema de navegador onde você quer guardar o endereço do site (URL) e a hora de acesso, mantendo a ordem em que os sites foram acessados.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class HistoricoNavegador {
    public static void main(String[] args) {
        Map<String, String> historico = new LinkedHashMap<>();

        historico.put("google.com", "10:00");
        historico.put("github.com", "10:05");
        historico.put("openai.com", "10:10");

        // Adicionando novamente a mesma chave atualiza o valor, mas mantém a posição
        historico.put("google.com", "10:15");

        // Exibir o histórico na ordem em que foi acessado
        System.out.println("Histórico de navegação:");
        for (String site : historico.keySet()) {
            System.out.println(site + " acessado às " + historico.get(site));
        }
    }
}
