package br.fastfood.model;

public class Bebida implements ItemCombo {
    private String nome;
    private double preco;
    private String tamanho; // Exemplo de atributo adicional

    public Bebida(String nome, double preco, String tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() {
        return nome + " (" + tamanho + ")";
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getTamanho() {
        return tamanho;
    }
}