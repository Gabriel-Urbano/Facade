package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private String nome;
    private double preco;
    private String sabor; // Exemplo de atributo adicional

    public Sobremesa(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    @Override
    public String getNome() {
        return nome + " (" + sabor + ")";
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }
}