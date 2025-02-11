package Exercicio4;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro("Mercedes", "Algum ai", 2020, 3);
        System.out.println(veiculo.exibirDetalhes());

        Veiculo veiculo1 = new Moto("Ronda", "Algum ai", 2020, 200);
        System.out.println(veiculo1.exibirDetalhes());
    }
}
