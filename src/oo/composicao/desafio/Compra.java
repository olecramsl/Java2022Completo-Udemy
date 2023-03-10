package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    private final ArrayList<Item> lstItens;

    public Compra() {
        lstItens = new ArrayList<>();
    }

    public void incluirItem(Produto produto, int quantidade) {
        lstItens.add(new Item(produto, quantidade));
    }

    public double obterValorTotalCompra() {
        double valorTotal = 0;
        for (Item item: lstItens) {
            valorTotal += item.calcularValorItem();
        }
        return valorTotal;
    }
}
