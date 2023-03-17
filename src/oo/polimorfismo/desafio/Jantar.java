package oo.polimorfismo.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(98.2);
        Arroz arroz = new Arroz(0.5);
        Feijao feijao = new Feijao(0.8);
        Sorvete sorvete = new Sorvete(0.3);

        pessoa.comer(arroz);
        pessoa.comer(feijao);
        pessoa.comer(sorvete);

        System.out.println(pessoa.getPeso());
    }
}
