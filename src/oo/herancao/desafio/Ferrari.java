package oo.herancao.desafio;

public class Ferrari extends Carro {
    public Ferrari() {
        super(320);
    }
    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
