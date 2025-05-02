package br.fastfood.model;

public class Burger implements ItemCombo {
    private String nome;
    private double preco;
    private String tipo; // Exemplo de atributo adicional

    public Burger(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome + " (" + tipo + ")";
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }
}