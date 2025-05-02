package br.fastfood.model;

public class Combo {
    private Burger burger;
    private Bebida bebida;
    private Sobremesa sobremesa;

    public Combo(Burger burger, Bebida bebida, Sobremesa sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public Burger getBurger() {
        return burger;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }
}