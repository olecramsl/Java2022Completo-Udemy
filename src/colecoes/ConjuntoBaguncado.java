package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "ResultOfMethodCallIgnored", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add((1.2));
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.remove("teste");
        conjunto.contains(1);
    }
}
