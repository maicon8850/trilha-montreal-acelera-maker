package com.maicon.trilha.Fundamentos;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        String numeroEscrito = "3.13";

        double numero = Double.parseDouble(numeroEscrito);

        System.out.println("Digite seu numero:" +numero);
    }
}
