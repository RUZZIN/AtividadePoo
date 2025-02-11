package Exercicio5;

public abstract class Pagamento {
    private double valorTotal;

    public Pagamento(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularValor();

    public void exibirDetalhes() {
        System.out.println("Valor do pagamento: R$ " + calcularValor());
    }
}
