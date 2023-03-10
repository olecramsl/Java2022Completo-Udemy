package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Sabonete", 12.00);
        Produto prod2 = new Produto("Desodorante", 20.00);
        Produto prod3 = new Produto("Perfume", 150.00);
        Produto prod4 = new Produto("Grão de bico", 6.00);

        Cliente cli1 = new Cliente("Marcelo");
        Cliente cli2 = new Cliente("Laura");

        Compra compra1 = new Compra(); // 64,00
        compra1.incluirItem(prod1, 2);
        compra1.incluirItem(prod2, 2);

        Compra compra2 = new Compra(); // 300,00
        compra2.incluirItem(prod3, 1);
        compra2.incluirItem(prod3, 1);

        cli1.adicionarCompra(compra1);
        cli1.adicionarCompra(compra2);

        Compra compra3 = new Compra(); // 24,00
        compra3.incluirItem(prod4, 2);
        compra3.incluirItem(prod1, 1);

        Compra compra4 = new Compra(); // 40,00
        compra4.incluirItem(prod2, 1);
        compra4.incluirItem(prod2, 1);

        cli2.adicionarCompra(compra3);
        cli2.adicionarCompra(compra4);

        System.out.println("Total Cliente 1: " + cli1.obterValorTotal());
        System.out.println("Total Cliente 2: " + cli2.obterValorTotal());

    }
}
