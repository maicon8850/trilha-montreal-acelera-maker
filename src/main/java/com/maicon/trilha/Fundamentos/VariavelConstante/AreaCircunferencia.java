package com.maicon.trilha.Fundamentos.VariavelConstante;

/**
 * Variáveis armazenam valores que podem ser alterados durante a execução do programa.
 * Constantes (usando final) armazenam valores fixos que não podem ser modificados após a atribuição.
 */
public class AreaCircunferencia {
    public static void main (String[] args){
          double raio = 3.4;
          final double PI = 3.14159;
          double area = PI * raio * raio;

        System.out.println(area);

        raio = 10;
        area = PI * raio *raio;
        System.out.println(area);
        System.out.println("Area = " + area + "m2.");
    }
}
