package br.com.fiapride.model;

public class Garrafa {

    // Atributos privados (Encapsulamento)
    private String material;
    private String formato;
    private int capacidadeEmMl;

    // CONSTRUTOR
    public Garrafa(String material, String formato, int capacidadeEmMl) {
        setMaterial(material);
        setFormato(formato);
        setCapacidadeEmMl(capacidadeEmMl);
    }

    // GETTERS (leitura)

    public String getMaterial() {
        return material;
    }

    public String getFormato() {
        return formato;
    }

    public int getCapacidadeEmMl() {
        return capacidadeEmMl;
    }

    // SETTERS (com proteção)

    private void setMaterial(String material) {
        if (material != null && !material.isEmpty()) {
            this.material = material;
        } else {
            System.out.println("Erro: material inválido.");
        }
    }

    private void setFormato(String formato) {
        if (formato != null && !formato.isEmpty()) {
            this.formato = formato;
        } else {
            System.out.println("Erro: formato inválido.");
        }
    }

    private void setCapacidadeEmMl(int capacidadeEmMl) {
        if (capacidadeEmMl > 0 && capacidadeEmMl <= 3000) {
            this.capacidadeEmMl = capacidadeEmMl;
        } else {
            System.out.println("Erro: capacidade inválida.");
        }
    }

    // MÉTODO 1
    public void aumentarCapacidade(int quantidade) {

        if (quantidade > 0) {
            setCapacidadeEmMl(this.capacidadeEmMl + quantidade);
            System.out.println("Capacidade aumentada com sucesso!");
        } else {
            System.out.println("Erro: A quantidade deve ser maior que zero.");
        }
    }

    // MÉTODO 2
    public void trocarMaterial(String novoMaterial) {

        setMaterial(novoMaterial);
    }

    // Método para mostrar informações
    public void exibirInformacoes() {
        System.out.println("Material: " + getMaterial());
        System.out.println("Formato: " + getFormato());
        System.out.println("Capacidade: " + getCapacidadeEmMl() + " ml");
    }

}