package oo.herancao.desafio;

public class TesteCarro {

    public static void main(String[] args) {
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        civic.acelerar();
        ferrari.acelerar();

        System.out.println("Civic: " + civic);
        System.out.println("Ferrari: " + ferrari);

        civic.frear();
        civic.frear();
        civic.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();

        System.out.println("Civic: " + civic);
        System.out.println("Ferrari: " + ferrari);

        civic.acelerar();
        civic.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println("Civic: " + civic);
        System.out.println("Ferrari: " + ferrari);
    }
}
