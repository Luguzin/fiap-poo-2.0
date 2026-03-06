package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Garrafa garrafa1 = new Garrafa();

        // Definindo estado inicial
        garrafa1.definirDados("Plástico", "Cilíndrica", 500);

        System.out.println("=== ESTADO INICIAL ===");
        garrafa1.exibirInformacoes();

        System.out.println("\n=== TESTE VALIDO ===");
        garrafa1.aumentarCapacidade(200);
        garrafa1.trocarMaterial("Alumínio");
        garrafa1.exibirInformacoes();

        System.out.println("\n=== TESTE INVALIDO ===");
        garrafa1.aumentarCapacidade(-100);
        garrafa1.trocarMaterial("");
        garrafa1.exibirInformacoes();
    }
}