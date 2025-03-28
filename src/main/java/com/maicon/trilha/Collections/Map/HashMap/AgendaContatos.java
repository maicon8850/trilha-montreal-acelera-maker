package com.maicon.trilha.Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Você quer criar uma agenda onde o nome da pessoa é a chave, e o telefone é o valor.
 */
public class AgendaContatos {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();

        // Adicionando contatos
        agenda.put("João", "99999-1111");
        agenda.put("Maria", "98888-2222");
        agenda.put("Pedro", "97777-3333");

        // Atualizando o telefone do João
        agenda.put("João", "94444-0000");

        // Buscando o telefone de Maria
        System.out.println("Telefone da Maria: " + agenda.get("Maria"));

        // Verificando se Pedro está na agenda
        if (agenda.containsKey("Pedro")) {
            System.out.println("Pedro está na agenda.");
        }

        // Exibindo todos os contatos
        System.out.println("\nContatos:");
        for (String nome : agenda.keySet()) {
            System.out.println(nome + ": " + agenda.get(nome));
        }
    }
}