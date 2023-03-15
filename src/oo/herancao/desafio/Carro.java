package oo.herancao.desafio;

public class Carro {
    private int velocidadeAtual = 0;
    private static int VELOCIDADE_MAXIMA;
    private static int ACELERACAO = 5;
    private static int FRENAGEM = 5;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar() {
        if (velocidadeAtual + ACELERACAO <= VELOCIDADE_MAXIMA) {
            velocidadeAtual += ACELERACAO;
        }
    }

    public void frear() {
        if (velocidadeAtual >= FRENAGEM) {
            velocidadeAtual -= FRENAGEM;
        } else {
            velocidadeAtual = 0;
        }
    }
    @Override
    public String toString() {
        return "A velocidade atual do carro é " + velocidadeAtual + " Km/h.";
    }
}
