package br.com.fiapride.model;

public class Garrafa {

    // Atributos agora protegidos
    private String material;
    private String formato;
    private int capacidadeEmMl;

    // Método para definir valores iniciais
    public void definirDados(String material, String formato, int capacidadeEmMl) {
        this.material = material;
        this.formato = formato;
        this.capacidadeEmMl = capacidadeEmMl;
    }

    // MÉTODO 1 - Aumentar capacidade
    public void aumentarCapacidade(int quantidade) {

        if (quantidade > 0) {
            capacidadeEmMl += quantidade;
            System.out.println("Capacidade aumentada com sucesso!");
        } else {
            System.out.println("Erro: A quantidade deve ser maior que zero.");
        }
    }

    // MÉTODO 2 - Trocar material
    public void trocarMaterial(String novoMaterial) {

        if (novoMaterial != null && !novoMaterial.isEmpty()) {
            material = novoMaterial;
            System.out.println("Material alterado com sucesso!");
        } else {
            System.out.println("Erro: Material inválido.");
        }
    }

    // Método auxiliar para exibir dados
    public void exibirInformacoes() {
        System.out.println("Material: " + material);
        System.out.println("Formato: " + formato);
        System.out.println("Capacidade: " + capacidadeEmMl + " ml");
    }
}