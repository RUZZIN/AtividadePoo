package Exercicio5;

public class TestePagamento{
     public static void main(String[] args) {
         Pagamento pagamentoCartao = new PagamentoCartao(100);
         System.out.println(pagamentoCartao.calcularValor());

         Pagamento pagamentoBoleto = new PagamentoBoleto(50);
         System.out.println(pagamentoBoleto.calcularValor());
     }
}
