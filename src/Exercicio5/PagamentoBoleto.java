package Exercicio5;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public double calcularValor() {
        return getValorTotal();
    }
}
