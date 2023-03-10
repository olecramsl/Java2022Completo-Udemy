package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private final ArrayList<Compra> lstCompras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome) {
        lstCompras = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarCompra(Compra compra) {
        lstCompras.add(compra);
    }

    public double obterValorTotal() {
        double valorTotal = 0;

        for (Compra compra: lstCompras) {
            valorTotal += compra.obterValorTotalCompra();
        }

        return valorTotal;
    }
}
