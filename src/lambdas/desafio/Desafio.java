package lambdas.desafio;

import oo.composicao.desafio.Produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto produto = new Produto("ipad", 3235.89, 0.13);

        Function<Produto, Double> precoReal = prod ->
                prod.getValor() * (1 - prod.getDesconto());
        UnaryOperator<Double> impostoMunicipal = valor ->
                valor >= 2500? 1.085 * valor: valor;
        UnaryOperator<Double> frete = valor ->
                valor >= 3000? valor + 100: valor + 50;
        UnaryOperator<Double> arredondar = valor -> {
            BigDecimal bigDecimal = BigDecimal.valueOf(valor);
            bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
            return bigDecimal.doubleValue();
        };
        Function<Double, String> formatar = valor ->
                ("R$ " + valor).replace('.', ',');
        String valorFinal = precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(produto);
        System.out.println(valorFinal);
    }
}
