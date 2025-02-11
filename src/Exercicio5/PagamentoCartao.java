package Exercicio5;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public double calcularValor() {
        return getValorTotal() * 1.2;
    }
}
