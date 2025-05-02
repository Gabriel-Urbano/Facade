package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {
    private Combo comboAtual;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                comboAtual = new Combo(new Burger("Combo Master Burger", 15.00, "Picanha"),
                                       new Bebida("Coca-Cola", 5.00, "Grande"),
                                       new Sobremesa("Brownie", 8.00, "Chocolate com Nozes"));
                break;
            case 2:
                comboAtual = new Combo(new Burger("Super Cheese", 13.50, "Duplo Queijo"),
                                       new Bebida("Suco de Laranja", 6.50, "Grande"),
                                       new Sobremesa("Mousse", 7.00, "Limao"));
                break;
                case 3:
                comboAtual = new Combo(new Burger("Duplo bacon cheddar", 18.50, "Duplo cheddar"),
                                       new Bebida("Fanta Uva", 4.50, "Médio"),
                                       new Sobremesa("Torta", 7.00, "Morango"));
                break;
            default:
                System.out.println("Opção de combo inválida.");
                comboAtual = null;
                break;
        }
    }

    public void exibirItens() {
        if (comboAtual != null) {
            System.out.println("--- Itens do Pedido ---");
            System.out.println("Burger: " + comboAtual.getBurger().getNome() + " - R$" + String.format("%.2f", comboAtual.getBurger().getPreco()));
            System.out.println("Bebida: " + comboAtual.getBebida().getNome() + " - R$" + String.format("%.2f", comboAtual.getBebida().getPreco()));
            System.out.println("Sobremesa: " + comboAtual.getSobremesa().getNome() + " - R$" + String.format("%.2f", comboAtual.getSobremesa().getPreco()));
            System.out.println("-----------------------");
        } else {
            System.out.println("Nenhum combo foi selecionado.");
        }
    }

    public double getPrecoTotal() {
        if (comboAtual != null) {
            return comboAtual.getBurger().getPreco() + comboAtual.getBebida().getPreco() + comboAtual.getSobremesa().getPreco();
        }
        return 0.0;
    }
}